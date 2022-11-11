package com.example.contatos.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "Nome obrigatorio")
    @Column(length = 180)
    private String nome;

    @NotNull(message = "Email obrigatorio")
    @Column(length = 180, nullable = false)
    private String email;

    @NotNull(message = "Data De Nascimento obrigatorio")
    @Column(length = 10, nullable = false)
    private String dataNascimento;

    @NotNull(message = "Telefone Obrigatorio")
    @Column(length = 15, nullable = false)
    private String telefone;

}
