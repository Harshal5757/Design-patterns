package com.ObserverPattern.example.first.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ObserverPattern.example.first.interfaces.Observer;
import com.ObserverPattern.example.first.interfaces.Subject;

public class EmailTopic implements Subject {

	private List<Observer> observerList;
	private String message;
	
	public EmailTopic() {
		this.observerList = new ArrayList<Observer>();
	}

	@Override
	public void subscribe(Observer observer) {
		Optional.of(observer).orElseThrow(() -> new NullPointerException("Null object/observer")); 
		if(!observerList.contains(observer)) {
			observerList.add(observer);
		}
	}

	@Override
	public void unsubscribe(Observer observer) {		
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver() {
		observerList.stream().forEach(obs -> obs.update());
	}

	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}
	
	public void postMessage(String msg) {
		System.out.println("Message posted to my Topic: " + msg);
		this.message = msg;
		notifyObserver();
	}

}
