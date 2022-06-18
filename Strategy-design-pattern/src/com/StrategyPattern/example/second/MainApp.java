package com.StrategyPattern.example.second;

import com.StrategyPattern.example.second.controller.CreditCardAlgo;
import com.StrategyPattern.example.second.controller.ShoppingCart;
import com.StrategyPattern.example.second.model.Product;

public class MainApp {

	public static void main(String[] args) {
		Product p1 = new Product(500, "ABC");
		Product p2 = new Product(1500, "XYZ");
		ShoppingCart cart = new ShoppingCart();
		cart.addProduct(p2);
		cart.addProduct(p1);
		cart.pay(new CreditCardAlgo("Harshal", "1231434"));
	}

}
