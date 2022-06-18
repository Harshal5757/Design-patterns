package com.StrategyPattern.example.second.controller;

import java.util.ArrayList;
import java.util.List;

import com.StrategyPattern.example.second.model.Product;

public class ShoppingCart {
	List<Product> productList;

	public ShoppingCart() {
		productList = new ArrayList<Product>();
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	public void removeProduct(Product product) {
		productList.remove(product);
	}
	
	public int calculateTotal() {
		return productList.stream()
				.map(e -> e.getPrice())
				.reduce((e1,e2) -> e1 + e2)
				.get();
	}
	
	public void pay(Payment payment) {
		payment.pay(this.calculateTotal());
	}
}
