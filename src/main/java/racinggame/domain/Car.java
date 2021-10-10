package racinggame.domain;

public class Car {
	private int position;
	CarName carName;

	public Car(String carName) {
		this.carName = new CarName(carName);
	}

	void move() {
		this.position = this.position + 1;
	}

	int getPosition() {
		return position;
	}

	String carName() {
		return carName.getName();
	}

	public void racing(int command) {
		if (CarMoveStatus.START.equals(CarMoveStatus.status(command))) {
			this.move();
		}
	}


}
