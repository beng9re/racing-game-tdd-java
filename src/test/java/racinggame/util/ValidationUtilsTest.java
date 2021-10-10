package racinggame.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidationUtilsTest {

	@Test
	void 사용자_문자열_체크() {
		assertThat(ValidationUtils.nameValid("")).isFalse();
		assertThat(ValidationUtils.nameValid(null)).isFalse();
		assertThat(ValidationUtils.nameValid("asdsad,sad,asdsad,sadasd,sadsad,")).isFalse();
		assertThat(ValidationUtils.nameValid(",sads,sad,,asdr,fgv,")).isFalse();
		assertThat(ValidationUtils.nameValid("sads,sad,,asdr,fgv")).isTrue();
	}

	@Test
	void 숫자_유효성_체크() {
		assertThat(ValidationUtils.validNumber("1")).isTrue();
		assertThat(ValidationUtils.validNumber("a")).isFalse();
	}

}
