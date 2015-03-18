package mta.factory.pattern;

public class JeepCar extends Car {

	public JeepCar() {
		super(CarType.JEEP);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building JEEP car");
		// add accessories
	}
}
