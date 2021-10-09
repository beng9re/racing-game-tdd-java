package racinggame.domain;

public enum CarMoveStatus {
	STOP,START;

	public static CarMoveStatus status(int command) {
		return command >= 4 ? CarMoveStatus.START : CarMoveStatus.STOP;
	}
}
