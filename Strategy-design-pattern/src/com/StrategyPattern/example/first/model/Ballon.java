package com.StrategyPattern.example.first.model;

import com.StrategyPattern.example.first.controller.ScoreAlgoBase;

public class Ballon implements ScoreAlgoBase{

	@Override
	public int calculateScore(int tap, int multiplier) {
		return tap * multiplier - 20;
	}
	
}
