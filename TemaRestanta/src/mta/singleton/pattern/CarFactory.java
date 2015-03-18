package mta.singleton.pattern;

import mta.exception.MyException;
import mta.factory.pattern.Car;
import mta.factory.pattern.CarType;
import mta.factory.pattern.JeepCar;
import mta.factory.pattern.LuxuryCar;
import mta.factory.pattern.SmallCar;

public class CarFactory {

	private static CarFactory instance = new CarFactory();

	private CarFactory() {
	}

	public static CarFactory getInstance() {
		return instance;
	}

	public Car buildCar(CarType model) throws MyException {
		Car car = null;
		switch (model) {
		case SMALL:
			car = new SmallCar();
			break;

		case JEEP:
			car = new JeepCar();
			break;

		case LUXURY:
			car = new LuxuryCar();
			break;

		default:
			throw new MyException("Invalid type of car!!");
		}
		return car;
	}

}
