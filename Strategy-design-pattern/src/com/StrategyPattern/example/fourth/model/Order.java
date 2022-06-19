package com.StrategyPattern.example.fourth.model;

import java.io.IOException;

import com.StrategyPattern.example.fourth.service.PayStrategy;

public class Order {
	private int totalCost = 0;
	private boolean isClosed = false;
	
	public void processOrder(PayStrategy payStrategy) throws IOException {
		payStrategy.collectPaymentDatails();
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost += totalCost;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed() {
		this.isClosed = true;
	}
	
	
}
