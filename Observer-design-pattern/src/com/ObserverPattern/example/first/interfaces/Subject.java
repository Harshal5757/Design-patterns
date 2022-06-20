package com.ObserverPattern.example.first.interfaces;

public interface Subject {
	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	
	void notifyObserver();
	
	Object getUpdate();
	
}
