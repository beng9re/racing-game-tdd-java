package racinggame.util;

public enum ValidationStatus {
	OK("성공"),
	TRY_TO_NUMBER_ERROR("[ERROR] 횟수는 숫자여야 합니다."),
	NAMES_NULL_ERROR("[ERROR] 자동차 이름은 공백이여서는 안됩니다."),
	NAMES_COMM_ERROR("[ERROR] 자동차 이름은 쉼표(,)로 구별하여야 합니다."),
	NAME_SIZE_FIVE_ERROR("[ERROR] 자동차 이름길이는 5이하야 합니다.");

	private final String message;

	ValidationStatus(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
