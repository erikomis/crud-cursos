package com.projeto.crudcurso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class CrudCursoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudCursoApplication.class, args);
    }

}
