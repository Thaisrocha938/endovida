package com.jk.endovida.controllers;

import com.jk.endovida.model.Usuario;
import com.jk.endovida.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //Exemplo de Read
    @GetMapping("/user/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable(value = "id") Long idUsuario) {
        return ResponseEntity.of(usuarioRepository.findById(idUsuario));
    }

    //Exemplo de Update
    @PutMapping("/users/{id}")
    public ResponseEntity<Usuario> updateUsario(@PathVariable(value = "id") Long idUsuario) {
        return null;
    }

    //Exemplo de Create
    @PostMapping("/users")
    public Usuario createUsuario(@Validated @RequestBody Usuario usuario) {
        //
        return null;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUsuario(@PathVariable(value = "id") Long idUsuario) {

    }

}
