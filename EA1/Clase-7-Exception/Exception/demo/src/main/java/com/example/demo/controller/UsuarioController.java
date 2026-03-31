package com.example.demo.controller;


import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioRepository repo;

    public UsuarioController(UsuarioRepository repo) {
        this.repo = repo;
    }

    //listar
    @GetMapping
    public List<Usuario> listar() {
        return repo.findAll();
    }

    //guardar
    @PostMapping
    public Usuario guardar(@Valid @RequestBody Usuario usuario) {
        return repo.save(usuario);

    }
}
