package racinggame.domain;

import java.util.function.Function;
import java.util.function.Supplier;

public enum CarPositionCompareStatus {
	BIG,
	SAME,
	SMALL;

	public boolean isBig() {
		return this.equals(CarPositionCompareStatus.BIG);
	}

	public boolean isSame() {
		return this.equals(CarPositionCompareStatus.SAME);
	}

	public boolean isSmall() {
		return this.equals(CarPositionCompareStatus.SMALL);
	}
}
