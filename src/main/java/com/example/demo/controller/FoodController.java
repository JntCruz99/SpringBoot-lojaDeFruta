package com.example.demo.controller;

import com.example.demo.food.Food;
import com.example.demo.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody Food data){
        repository.save(data);
    }

    @GetMapping
    public List<Food> getAll(){

        List<Food> foodList = repository.findAll();
        return foodList;
    }
}
