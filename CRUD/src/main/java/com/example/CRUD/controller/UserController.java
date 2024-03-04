package com.example.CRUD.controller;

import com.example.CRUD.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return "Obtendo detalhes do usuário com ID: " + id;
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        return "Criando usuário: " + user.toString();
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id,@RequestBody User user) {
        return "Atualizando usuário com ID " + id + ": " + user.toString();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "Exclui usuário com ID: " + id;
    }
}
