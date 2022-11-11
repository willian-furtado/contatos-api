package com.example.contatos.resource;


import com.example.contatos.model.Contato;
import com.example.contatos.service.ContatosService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/contatos")
@RequiredArgsConstructor
public class ContatosResource {

    @Autowired
    ContatosService contatosService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Contato> salvarContato(@RequestBody @Valid Contato contato) {
        Contato contatoSalvo = contatosService.salvarContato(contato);
        return new ResponseEntity<>(contatoSalvo, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Long> deletarContato(@PathVariable Long id) {
        Long idDeletado = contatosService.deletarContato(id);
        return new ResponseEntity<>(idDeletado, HttpStatus.OK);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Contato>> listarContatos() {
        List<Contato> contatos = contatosService.listarContatos();
        return new ResponseEntity<>(contatos, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Contato> atualizarContato(@RequestBody @Valid Contato contato) {
        Contato contatoSave = contatosService.atualizarContato(contato);
        return new ResponseEntity<>(contatoSave, HttpStatus.OK);
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Optional<Contato>> buscarContatoPorId(@PathVariable Long id) {
        Optional<Contato> contato = contatosService.buscarContatoPorId(id);
        return new ResponseEntity<>(contato, HttpStatus.OK);
    }

}
