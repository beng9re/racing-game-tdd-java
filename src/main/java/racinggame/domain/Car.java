package racinggame.domain;

public class Car {
	CarPosition carPosition;
	CarName carName;

	public Car(String carName) {
		this.carName = new CarName(carName);
		this.carPosition = new CarPosition(0);
	}

	void move() {
		carPosition.add(1);
	}

	String carName() {
		return carName.getName();
	}

	public void racing(int command) {
		if (CarMoveStatus.START.equals(CarMoveStatus.status(command))) {
			this.move();
		}
	}

	@Override
	public String toString() {
		return carName.getName() + " : " + carPosition;
	}

	public CarPositionCompareStatus compete(Car targetCar) {
		return this.carPosition.compareCarPosition(targetCar.carPosition);
	}
}
