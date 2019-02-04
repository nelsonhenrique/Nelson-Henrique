package com.p2lp2.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	private String cpf;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "client")
	private CardVIP vip;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
	private List<Address> addresses;
	
	public Client() {
	
	}

	public Client(Integer id, String nome, String cpf) {
		super();
		this.id = id;
		this.name = nome;
		this.cpf = cpf;
		this.addresses = new ArrayList<Address>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
	
	
}
