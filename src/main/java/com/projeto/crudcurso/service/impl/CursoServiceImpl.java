package com.projeto.crudcurso.service.impl;

import com.projeto.crudcurso.dto.CursoDto;
import com.projeto.crudcurso.exception.NotFoundException;
import com.projeto.crudcurso.mapper.CursoMapper;
import com.projeto.crudcurso.model.Curso;
import com.projeto.crudcurso.repository.CursoRepository;
import com.projeto.crudcurso.service.CursoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    private CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }


    @Override
    public Curso createCurso(CursoDto createCurso) {
        Curso curso = CursoMapper.fromDtoToEntity(createCurso);
        return cursoRepository.save(curso);
        
        
    }

    @Override
    public Curso updateCurso(CursoDto updateCurso, Long id) {
        var existsCurso = getCurso(id);

        if (existsCurso.isEmpty()) {
            throw  new NotFoundException("Curso não encontrado");
        }
        updateCurso.setId(id);

        updateCurso.setCreatedAt(existsCurso.get().getCreatedAt());




        return  cursoRepository.save(CursoMapper.fromDtoToEntity(updateCurso));
    }


    @Override
    public void deleteCurso(Long id) {
        var existsCurso = getCurso(id);
        if (existsCurso.isEmpty()) {
            throw  new NotFoundException("Curso não encontrado");
        }

        cursoRepository.deleteById(id);
    }

    @Override
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso updateActive(Long id) {
        var existsCurso = getCurso(id);

        if (existsCurso.isEmpty()) {
            throw  new NotFoundException("Curso não encontrado");
        }
        Curso curso = existsCurso.get();
        curso.setActive(!curso.getActive());
        return cursoRepository.save(curso);

    }


    private Optional<Curso> getCurso(Long id) {
        return cursoRepository.findById(id);
    }

}
