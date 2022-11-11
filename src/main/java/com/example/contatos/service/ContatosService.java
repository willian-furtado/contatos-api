package com.example.contatos.service;

import com.example.contatos.model.Contato;
import com.example.contatos.repository.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ContatosService {

    @Autowired
    ContatosRepository contatosRepository;

    public Contato salvarContato(Contato contato) {
        return contatosRepository.save(contato);
    }

    public Long deletarContato(Long id) {
        Contato contato = contatosRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        contatosRepository.delete(contato);
        return  contato.getId();
    }

    public List<Contato> listarContatos() {
        return contatosRepository.findAll();
    }

    public Contato atualizarContato(Contato contato) {
        return contatosRepository.save(contato);
    }

    public Optional<Contato> buscarContatoPorId(Long id) {
        return Optional.ofNullable(contatosRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }
}
