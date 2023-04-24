package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notebook")
public class notebook {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String brand;
	
	private int pages;
	
	private int price;
	
	private String page_size;
	
	public notebook() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPage_size() {
		return page_size;
	}

	public void setPage_size(String page_size) {
		this.page_size = page_size;
	}

	@Override
	public String toString() {
		return "notebook [id=" + id + ", brand=" + brand + ", pages=" + pages + ", price=" + price + ", page_size="
				+ page_size + "]";
	}

	public notebook(Long id, String brand, int pages, int price, String page_size) {
		super();
		this.id = id;
		this.brand = brand;
		this.pages = pages;
		this.price = price;
		this.page_size = page_size;
	}
	
	
	
}
