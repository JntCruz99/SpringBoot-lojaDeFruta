package com.example.demo.food;

import jakarta.persistence.*;
import lombok.*;




@Data
@Entity
@Table(name = "tb_food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

}
