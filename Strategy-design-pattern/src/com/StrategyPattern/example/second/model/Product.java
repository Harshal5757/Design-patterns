package com.StrategyPattern.example.second.model;

public class Product {
	private int price;
	private String cpsCode;
	
	public Product(int price, String cpsCode) {
		this.price = price;
		this.cpsCode = cpsCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCpsCode() {
		return cpsCode;
	}
	public void setCpsCode(String cpsCode) {
		this.cpsCode = cpsCode;
	}
}
