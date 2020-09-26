package com.example.oracledb.demooracleconnection.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue
	Integer id;
	
	@Column
	private String state;
	
	@Column
	private String street;
	
	@OneToOne
	private Person person;

	public Integer getId() {
		return id;
	}

	public String getState() {
		return state;
	}

	public String getStreet() {
		return street;
	}

	public Person getPerson() {
		return person;
	}
}
