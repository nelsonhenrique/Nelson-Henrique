package com.p2lp2.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private float price;
	private String description;
	public Product() {
	}
	
	public Product(Integer id, float price, String description) {
		super();
		this.id = id;
		this.price = price;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
		
	public void sell(Integer id) {
		if (this.id == id) {
			System.out.println("Venda Efetuada");
		}else {
			System.out.println("Erro");
		}
	}
	
}
