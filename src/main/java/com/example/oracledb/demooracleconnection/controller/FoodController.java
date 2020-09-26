package com.example.oracledb.demooracleconnection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.oracledb.demooracleconnection.dao.FoodRepository;
import com.example.oracledb.demooracleconnection.entity.Food;

@RestController
@RequestMapping("/food")
public class FoodController {

	@Autowired
	FoodRepository foodRepository;
	
	@GetMapping("/get/all")
	public List<Food> getAll(){
		return foodRepository.findAll();
	}
	
	@PostMapping("/post/food")
	public void postFood(@RequestBody Food food) {
		foodRepository.save(food);
	}
}
