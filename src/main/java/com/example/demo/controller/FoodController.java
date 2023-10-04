package com.example.demo.controller;

import com.example.demo.food.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {


    @GetMapping
    public String hello(){


        return "helloWord";
    }
}
