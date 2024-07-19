package com.projeto.crudcurso.service;

import com.projeto.crudcurso.dto.CursoDto;
import com.projeto.crudcurso.model.Curso;

import java.util.List;

public interface CursoService {
    Curso createCurso(CursoDto createCurso);
    Curso updateCurso(CursoDto updateCurso, Long id);
    void deleteCurso(Long id);
    List<Curso> findAll();
    Curso updateActive(Long id);
}
