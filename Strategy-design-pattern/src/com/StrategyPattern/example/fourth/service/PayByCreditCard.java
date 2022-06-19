package com.StrategyPattern.example.fourth.service;

import java.io.IOException;
import java.util.Optional;

import com.StrategyPattern.example.fourth.model.CreditCard;

public class PayByCreditCard implements PayStrategy{
	
	private CreditCard card;

	@Override
	public boolean pay(int paymentAmount) {
		if(Optional.of(card).isPresent()) {
			System.out.println("Paying " + paymentAmount + " using Credit Card.");
			return true;
		}
		return false;
	}

	@Override
	public void collectPaymentDatails() throws IOException {
		System.out.println("Enter the user's card number: ");
		String number = READER.readLine();
		System.out.println("Enter the user's expiry date: ");
		String date = READER.readLine();
		System.out.println("Enter the user's CVV: ");
		String cvv = READER.readLine();
		card = new CreditCard(number, date, cvv);
	}
	
}
