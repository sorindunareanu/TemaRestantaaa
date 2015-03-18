package mta.observer.pattern;

public class SmallCarObserver extends Observer {

	public SmallCarObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("SmallCarObserver:this car can drive"
				+ subject.getState() / 4 + "km");
	}

}
