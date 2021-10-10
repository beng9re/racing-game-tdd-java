package racinggame.util;

public class ValidationUtils {
	private static final String COMMA = ",";

	public static ValidationStatus nameValid(String text) {
		if (text == null || text.length() == 0) {
			return ValidationStatus.NAMES_NULL_ERROR;
		}
		if (COMMA.equals(text.substring(text.length() - 1)) || COMMA.equals(text.substring(0, 1))) {
			return ValidationStatus.NAMES_COMM_ERROR;
		}
		if (!nameFiveValid(text)) {
			return ValidationStatus.NAME_SIZE_FIVE_ERROR;
		}
		return ValidationStatus.OK;
	}

	private static boolean nameFiveValid(String texts) {
		for (String text : texts.split(",")) {
			if (text.length() > 5) {
				return false;
			}
		}
		return true;
	}

	public static ValidationStatus validNumber(String text) {
		try {
			Integer.parseInt(text);
		} catch (NumberFormatException e) {
			return ValidationStatus.TRY_TO_NUMBER_ERROR;
		}
		return ValidationStatus.OK;
	}
}
