package com.projeto.crudcurso.mapper;

import com.projeto.crudcurso.dto.CursoDto;
import com.projeto.crudcurso.model.Curso;

public class CursoMapper {

    public static Curso  fromDtoToEntity(CursoDto cursoDto) {
        return Curso.builder()
                .id(cursoDto.getId())
                .name(cursoDto.getName())
                .category(cursoDto.getCategory())
                .active(cursoDto.getActive())
                .createdAt(cursoDto.getCreatedAt())
                .updatedAt(cursoDto.getUpdatedAt())
                .build();
    }
}
