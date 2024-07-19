package com.projeto.crudcurso.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "curso")
public class Curso  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    private String name;

    private String category;

    private Boolean active;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;


    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;


}
