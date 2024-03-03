package com.example.CRUD.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class Controller {

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return "Obtendo detalhes do usuário com ID: " + id;
    }

    @PostMapping
    public String createUser(@RequestBody String user) {
        return "Criando usuário: " + user;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id,@RequestBody String user) {
        return "Atualizando usuário com ID " + id + ": " + user;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "Exclui usuário com ID: " + id;
    }
}
