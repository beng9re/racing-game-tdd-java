package racinggame.util;



import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void 문자열이_널이면_공백으로_치환된다(){
		assertThat(StringUtils.ifNullGetEmpty(null)).isEqualTo("");
		assertThat(StringUtils.ifNullGetEmpty("a")).isEqualTo("a");
	}

}