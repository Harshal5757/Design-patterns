package com.StrategyPattern.example.third.interfaces;

import java.util.function.UnaryOperator;

public interface Discounter{
	
	Double applyDiscount(Integer amount);
	
	static Discounter diwaliDiscount() {
		return amount -> amount - amount * 0.08;
	}

	static Discounter holiDiscount() {
		return amount -> amount - amount * 0.05;
	}
	
	static Discounter gudipadwaDiscount() {
		return amount -> amount - amount * 0.12;
	}
}
