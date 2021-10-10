package racinggame.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidationUtilsTest {

	@Test
	void 사용자_문자열_체크() {
		assertThat(ValidationUtils.nameValid("")).isEqualTo(ValidationStatus.NAMES_NULL_ERROR);
		assertThat(ValidationUtils.nameValid(null)).isEqualTo(ValidationStatus.NAMES_NULL_ERROR);
		assertThat(ValidationUtils.nameValid("asdsad,sad,asdsad,sadasd,sadsad,")).isEqualTo(ValidationStatus.NAMES_COMM_ERROR);
		assertThat(ValidationUtils.nameValid("asdsad,sad,asdsad,sadasad,sadsad")).isEqualTo(ValidationStatus.NAME_SIZE_FIVE_ERROR);
		assertThat(ValidationUtils.nameValid(",sads,sad,,asdr,fgv,")).isEqualTo(ValidationStatus.NAMES_COMM_ERROR);
		assertThat(ValidationUtils.nameValid("sads,sad,,asdr,fgv")).isEqualTo(ValidationStatus.OK);
	}

	@Test
	void 숫자_유효성_체크() {
		assertThat(ValidationUtils.validNumber("1")).isEqualTo(ValidationStatus.OK);
		assertThat(ValidationUtils.validNumber("a")).isEqualTo(ValidationStatus.TRY_TO_NUMBER_ERROR);
	}

}
