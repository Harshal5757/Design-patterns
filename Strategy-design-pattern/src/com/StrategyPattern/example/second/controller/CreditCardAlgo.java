package com.StrategyPattern.example.second.controller;

public class CreditCardAlgo implements Payment {
	
	private String name;
	private String cardName;
	
	
	public CreditCardAlgo(String name, String cardName) {
		this.name = name;
		this.cardName = cardName;
	}


	@Override
	public void pay(int amount) {
//		return 0;
		System.out.println(amount + " paid using card");
	}

}
