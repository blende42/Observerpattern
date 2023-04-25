package ch.allianz.lehrlinge.observer.impl;

import java.util.ArrayList;
import java.util.List;

import ch.allianz.lehrlinge.model.Data;
import ch.allianz.lehrlinge.observer.api.Observer;
import ch.allianz.lehrlinge.observer.api.Subject;

public class SubjectImpl implements Subject {
	List<Observer> observers = new ArrayList<Observer>();
	Data data;
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);	
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(this.data);
		}
	}
	public void setData(Data data) {
		this.data = data;
		notifyObservers();
	}
}
