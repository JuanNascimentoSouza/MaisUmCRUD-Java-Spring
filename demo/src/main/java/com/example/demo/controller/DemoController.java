package com.example.demo.controller;

import com.example.demo.demo.Demo;
import com.example.demo.demo.DemoRepository;
import com.example.demo.demo.DemoRequestDTO;
import com.example.demo.demo.DemoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveDemo(@RequestBody DemoRequestDTO data){
        Demo demoData = new Demo(data);
        repository.save(demoData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<DemoResponseDTO> getAll(){

        List<DemoResponseDTO> demoList = repository.findAll().stream().map(DemoResponseDTO::new).toList();
        return demoList;
    }
}