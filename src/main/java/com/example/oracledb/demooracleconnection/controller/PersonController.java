package com.example.oracledb.demooracleconnection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.oracledb.demooracleconnection.dao.PersonRepository;
import com.example.oracledb.demooracleconnection.entity.Gender;
import com.example.oracledb.demooracleconnection.entity.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonRepository personRepository;
	
	@RequestMapping("/post")
	public void insertPerson() {
		Person p1 = new Person("sara","rama",Gender.MALE);
		personRepository.save(p1);
	}
}

