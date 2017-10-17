package com.yourcodelab.model;

public class Category {

private int idCategory;

private String Category;

public Category(int id, String category) {
	super();
	this.idCategory = id;
	this.Category = category;
}


public int getId() {
	return idCategory;
}
public void setId(int id) {
	this.idCategory = id;
}
public String getCategory() {
	return Category;
}
public void setDiscription(String category) {
	this.Category = category;
}

	
}
