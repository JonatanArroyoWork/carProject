package carProject;

public class CarFactory {
	
	public Car createCar(int type) {
		if (type==Car.BACK_WHEEL_DRIVE) {
			return null;
		}
		if (type==Car.FRONT_WHEEL_DRIVE) {
			return null;
		}
		if (type==Car.FOUR_WHEEL_DRIVE) {
			return null;
		}
		throw new Exception("Not valid type";)
	}

}
