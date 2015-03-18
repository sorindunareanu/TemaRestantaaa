package mta.observer.pattern;

import mta.exception.MyException;

public abstract class Observer {
	protected Subject subject;

	public abstract void update() throws MyException;
}
