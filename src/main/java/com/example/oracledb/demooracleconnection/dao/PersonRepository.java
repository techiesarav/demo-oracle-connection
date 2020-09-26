package com.example.oracledb.demooracleconnection.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oracledb.demooracleconnection.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
}
