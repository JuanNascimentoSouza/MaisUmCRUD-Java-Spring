package com.example.demo.demo;

public record DemoResponseDTO(Long id, String title, String image, Integer price) {
    public DemoResponseDTO(Demo demo){
        this(demo.getId(), demo.getTittle(), demo.getImage(), demo.getPrice());
    }
}