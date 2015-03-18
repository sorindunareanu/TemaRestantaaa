package mta.observer.pattern;

import java.util.ArrayList;
import java.util.List;

import mta.exception.MyException;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private float state;

	public float getState() {
		return state;
	}

	public void setState(int state) throws MyException {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() throws MyException {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
