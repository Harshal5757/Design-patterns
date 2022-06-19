package com.StrategyPattern.example.fourth.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {

	private static final Map<String, String> DATA_BASE = new HashMap<String, String>();
	private String email;
	private String password;
	private boolean signedIn;

	static {
		DATA_BASE.put("Harshal", "harshal.chaudhari2542@gmail.com");
		DATA_BASE.put("Nikita", "nikita.chaudhari2542@gmail.com");
	}

	@Override
	public boolean pay(int paymentAmount) {
		if(signedIn) {
			System.out.println("Paying " + paymentAmount + " using PayPal.");
			return true;
		}
		return false;
	}

	@Override
	public void collectPaymentDatails() throws IOException {
		while (!signedIn) {
			System.out.println("Enter the user's email: ");
			email = READER.readLine();
			System.out.println("Enter the user's Password: ");
			password = READER.readLine();
			signedIn = email.equals(DATA_BASE.get(password));
			System.out.println(signedIn ? "Data verification has been successful." : "Wrong email or password!");
		}
	}
}
