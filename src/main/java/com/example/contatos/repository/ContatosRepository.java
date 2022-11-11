package com.example.contatos.repository;

import com.example.contatos.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatosRepository extends JpaRepository<Contato, Long> {
}
