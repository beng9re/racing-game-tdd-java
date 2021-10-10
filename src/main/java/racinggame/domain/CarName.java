package racinggame.domain;

import java.util.Objects;

public class CarName {
	private static final String EMPTY_STRING = "";
	private final String name;

	CarName(String name) {
		validate(name);
		this.name = name;
	}

	private void validate(String carName) {
		if (carName == null || carName.equals(EMPTY_STRING)) {
			throw new IllegalArgumentException("[ERROR] 이름에는 공백이 들어갈 수 없습니다. :'" + carName + "'");
		}
		if (carName.length() > 5) {
			throw new IllegalArgumentException("[ERROR] 이름은 5이하여야 합니다. length: " + carName.length());
		}
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CarName carName = (CarName)o;
		return Objects.equals(name, carName.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
