package com.StrategyPattern.example.first;

import com.StrategyPattern.example.first.controller.Scoreboard;
import com.StrategyPattern.example.first.model.Ballon;
import com.StrategyPattern.example.first.model.Crawn;
import com.StrategyPattern.example.first.model.SquareBallon;

public class MainApp {

	public static void main(String[] args) {
		Scoreboard scoreboard = new Scoreboard();
		scoreboard.algoBase = new Ballon();
		scoreboard.getScore(5, 10);
		
		scoreboard.algoBase = new SquareBallon();
		scoreboard.getScore(5, 10);
		
		scoreboard.algoBase = new Crawn();
		scoreboard.getScore(5, 10);
	}

}
