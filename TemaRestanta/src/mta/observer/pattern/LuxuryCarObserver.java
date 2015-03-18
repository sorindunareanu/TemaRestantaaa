package mta.observer.pattern;

import mta.exception.MyException;

public class LuxuryCarObserver extends Observer {

	public LuxuryCarObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() throws MyException {
		// TODO Auto-generated method stub
		if (subject.getState() < 0)
			throw new MyException("Negativ number");
		System.out.println("LuxuryCarObserver:this car can drive"
				+ subject.getState() / 10 + "km");
	}

}
