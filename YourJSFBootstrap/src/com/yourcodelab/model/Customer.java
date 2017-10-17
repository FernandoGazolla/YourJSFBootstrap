package com.yourcodelab.model;

public class Customer {
	private Integer id;
	private String name;
	private String email;
	private Category category;
	
	

	public Customer(Integer id, String name, String email,Category category){
		this.id = id;
		this.name = name;
		this.email = email;
		this.category = category;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
