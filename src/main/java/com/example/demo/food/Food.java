package com.example.demo.food;

import lombok.*;

import javax.persistence.*;

@Table(name = "foods")
@Entity(name = "foods ")
@Data
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

}
