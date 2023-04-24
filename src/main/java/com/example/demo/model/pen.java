package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pen")
public class pen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String model_no;
	
	private int price;
	
	private String color;
	
	public pen() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel_no() {
		return model_no;
	}

	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "pen [id=" + id + ", model_no=" + model_no + ", price=" + price + ", color=" + color + "]";
	}

	public pen(Long id, String model_no, int price, String color) {
		super();
		this.id = id;
		this.model_no = model_no;
		this.price = price;
		this.color = color;
	}
	
}
