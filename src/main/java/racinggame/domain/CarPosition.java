package racinggame.domain;

import java.util.Objects;

public class CarPosition {
	private int position = 0;
	private static final String POSITION_CARECTOR = "-";

	public CarPosition(int position) {
		validate(position);
		this.position = position;
	}

	public void add(int number) {
		validate(this.position + number);
		this.position += number;

	}

	public CarPositionCompareStatus compareCarPosition(CarPosition carPosition) {
		if (this.position < carPosition.position) {
			return CarPositionCompareStatus.SMALL;
		}
		if (this.position > carPosition.position) {
			return CarPositionCompareStatus.BIG;
		}
		return CarPositionCompareStatus.SAME;
	}

	private void validate(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("숫자는 -가 될수 없습니다.");
		}
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < position; i++) {
			stringBuilder.append(POSITION_CARECTOR);
		}
		return  stringBuilder.toString();
	}

	@Override
	public boolean equals(Object target) {
		if (this == target) {
			return true;
		}
		if (target == null || getClass() != target.getClass()) {
			return false;
		}
		CarPosition that = (CarPosition)target;
		return position == that.position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position);
	}
}
