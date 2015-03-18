package mta.factory.pattern;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		System.out.println("Building LUXERY car");
	}

}
