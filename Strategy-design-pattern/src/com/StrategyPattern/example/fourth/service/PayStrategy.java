package com.StrategyPattern.example.fourth.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface PayStrategy {
	final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	boolean pay(int paymentAmount);

	void collectPaymentDatails() throws IOException;
}
