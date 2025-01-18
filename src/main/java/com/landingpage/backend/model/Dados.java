package com.landingpage.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dados")
@Data
@EqualsAndHashCode(of = "id")
public class Dados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Email
    @Column(name = "email")
    private String email;
    
    @Column(name = "feedback")
    private String feedback;


}
