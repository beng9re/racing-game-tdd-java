package racinggame.util;

import java.util.Optional;

public class StringUtils {
	public static String ifNullGetEmpty(String source) {
		return Optional.ofNullable(source).orElse("");
	}
}
