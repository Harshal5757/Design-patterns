package com.StrategyPattern.example.second.controller;

public class PaypalAlgo implements Payment{

	private String email;
	private String password;
	
	public PaypalAlgo(String name, String password) {
		this.email = name;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal");
	}
	
}
