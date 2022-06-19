package com.StrategyPattern.example.fourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.StrategyPattern.example.fourth.model.Order;
import com.StrategyPattern.example.fourth.service.PayByCreditCard;
import com.StrategyPattern.example.fourth.service.PayByPayPal;
import com.StrategyPattern.example.fourth.service.PayStrategy;

public class MainApp {
	private static Map<Integer, Integer> priceOnOrder = new HashMap<Integer, Integer>();
	private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	private static Order order = new Order();
	private static PayStrategy payStrategy;
	
	static {
		priceOnOrder.put(1, 2200);
		priceOnOrder.put(2, 1850);
		priceOnOrder.put(3, 1500);
		priceOnOrder.put(4, 1050);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		while(!order.isClosed()) {
			int cost;
			String continueChoice;
			do {
				System.out.println("Please select a Product:" + "\n" +
						"1 - Mother Board" + "\n" +
						"2 - CPU" + "\n" +
						"3 - HDD" + "\n" +
						"4 - Memory");
//				int choice = Integer.parseInt(READER.readLine());
				
				cost = priceOnOrder.get(Integer.parseInt(READER.readLine()));
				
				System.out.println("Count: ");
				
//				int count = Integer.parseInt(READER.readLine());
				
				order.setTotalCost(cost * Integer.parseInt(READER.readLine()));
				
				System.out.println("Do you wish to continue selecting product: Y/N");
			} while(READER.readLine().equalsIgnoreCase("y"));
			if(payStrategy == null) {
				System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
				String paymentMode = READER.readLine();
				payStrategy = paymentMode.equals("1") ? new PayByPayPal() : new PayByCreditCard();
			}
			order.processOrder(payStrategy);
			System.out.println("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
			if(READER.readLine().equalsIgnoreCase("P")) {
				System.out.println(payStrategy.pay(order.getTotalCost()) ? "Payment has been successful." : "FAIL! Please, check your data.");
				order.setClosed();
			}
		}
	}

}
