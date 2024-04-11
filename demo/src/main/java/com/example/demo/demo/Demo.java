package com.example.demo.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "demo")
@Entity(name="demo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Demo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tittle;
    private String image;
    private Integer price;

    public Demo(DemoRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.tittle = data.title();
    }
}
