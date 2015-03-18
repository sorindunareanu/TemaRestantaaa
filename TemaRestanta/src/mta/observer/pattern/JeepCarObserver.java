package mta.observer.pattern;

public class JeepCarObserver extends Observer {

	public JeepCarObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("JeepCarObserver:this car can drive"
				+ subject.getState() / 14 + "km");
	}

}
