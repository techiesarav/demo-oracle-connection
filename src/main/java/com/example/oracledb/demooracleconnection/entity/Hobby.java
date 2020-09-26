package com.example.oracledb.demooracleconnection.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Hobby {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	String value;
	
	@ManyToMany()
	@JoinTable(name="hobby_person",joinColumns={ @JoinColumn(name="hobby_id") },
		inverseJoinColumns={@JoinColumn(name="person_id")})
	List<Person> persons;	
		
}