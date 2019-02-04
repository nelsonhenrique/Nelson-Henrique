package com.p2lp2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String street;
	private String city;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "client_id")
	private Client client;
	
	
	public Address() {
		
	}
	
	public Address(Integer id, String street, String city) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Client getClient() {
		return client;
	}
	
}
