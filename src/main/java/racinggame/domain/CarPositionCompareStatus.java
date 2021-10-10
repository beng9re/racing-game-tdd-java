package racinggame.domain;


public enum CarPositionCompareStatus {
	BIG,
	SAME,
	SMALL;

	public boolean isBig() {
		return this.equals(CarPositionCompareStatus.BIG);
	}

	public boolean isSmall() {
		return this.equals(CarPositionCompareStatus.SMALL);
	}
}
