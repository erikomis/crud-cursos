package com.projeto.crudcurso.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CursoDto {

    private  Long id;

    @NotBlank(message = "Valor não pode ser nulo ou vazio")
    private String name;

    @NotBlank(message = "Valor não pode ser nulo ou vazio")
    private String category;

    private Boolean active;

    private Date createdAt;

    private Date updatedAt;


}
