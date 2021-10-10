package racinggame.util;

public class ValidationUtils {
	private final static String COMMA = ",";

	public static boolean nameValid(String text) {
		if (text == null || text.length() == 0) {
			return false;
		}
		return !COMMA.equals(text.substring(text.length() - 1))
			&& !COMMA.equals(text.substring(0, 1));
	}

	public static boolean validNumber(String s) {
		try {
			Integer.parseInt(s);
		}catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
