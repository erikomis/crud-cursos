package com.projeto.crudcurso.controller;

import com.projeto.crudcurso.dto.CursoDto;
import com.projeto.crudcurso.model.Curso;
import com.projeto.crudcurso.service.CursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/cursos")
public class CursoController {


    @Autowired
    private CursoService cursoService;

    @PostMapping
    public ResponseEntity<Curso>createCurso(@Valid @RequestBody CursoDto createCurso){
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoService.createCurso(createCurso));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Curso>updateCurso(@Valid @RequestBody CursoDto updateCurso, @PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(cursoService.updateCurso(updateCurso, id));
    }

    @PatchMapping("/{id}/active")
    public ResponseEntity<Curso>updateActive(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(cursoService.updateActive(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteCurso(@PathVariable Long id){
        cursoService.deleteCurso(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }


    @GetMapping
    public ResponseEntity<List<Curso>>findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(cursoService.findAll());
    }

}
