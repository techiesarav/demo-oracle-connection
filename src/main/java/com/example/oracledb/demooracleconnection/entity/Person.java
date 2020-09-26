package com.example.oracledb.demooracleconnection.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@OneToOne(mappedBy="person")
	Address address;
	
	Gender gender;
	
	@ManyToMany(mappedBy="persons")
	Set<Hobby> hobbies;
	
	protected Person() {
	}
	
	public Person( String firstName, String lastName,Gender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public Gender getGender() {
		return gender;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address;
	}
	
}
