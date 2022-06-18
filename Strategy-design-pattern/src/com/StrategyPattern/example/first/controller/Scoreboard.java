package com.StrategyPattern.example.first.controller;

public class Scoreboard {
	public ScoreAlgoBase algoBase;
	
	public void getScore(Integer tap,Integer multipier) {
		System.out.println(algoBase.calculateScore(tap, multipier));
	}
}
