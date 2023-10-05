package com.example.demo.controller;

import com.example.demo.food.Food;
import com.example.demo.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @GetMapping("/hello")
    public String hello(){
        return "helloWord";
    }
    @GetMapping
    public ResponseEntity<List<Food>> findall(){
        return ResponseEntity.ok(repository.findAll());
    }
    @PostMapping
    public ResponseEntity<Food> save(@RequestBody Food food){
        return ResponseEntity.ok(repository.save(food));
    }

}
