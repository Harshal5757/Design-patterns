package com.StrategyPattern.example.third;

import com.StrategyPattern.example.third.interfaces.Discounter;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Final Price:- "+Discounter.diwaliDiscount().applyDiscount(1000));
	}

}
