package com.ObserverPattern.example.first;

import com.ObserverPattern.example.first.interfaces.Observer;
import com.ObserverPattern.example.first.model.EmailTopic;
import com.ObserverPattern.example.first.model.EmailTopicSubscriber;

public class MainApp {

	public static void main(String[] args) {
		EmailTopic topic = new EmailTopic();
		
		Observer firstObserver = new EmailTopicSubscriber("firstObserver");
		Observer secondObserver = new EmailTopicSubscriber("secondObserver");
		Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");
		
		topic.subscribe(firstObserver);
		topic.subscribe(secondObserver);
		topic.subscribe(thirdObserver);
		
		firstObserver.setSubject(topic);
		secondObserver.setSubject(topic);
		thirdObserver.setSubject(topic);
		
		firstObserver.update();
		
		topic.postMessage("How is it!!!!");
	}

}
