package com.example.oracledb.demooracleconnection.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oracledb.demooracleconnection.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {

}
