package com.projeto.crudcurso.repository;

import com.projeto.crudcurso.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CursoRepository extends JpaRepository<Curso, Long> {
}
