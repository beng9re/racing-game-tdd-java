package racinggame.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CarNameTest {

	@Test
	void 차의_이름의_길이가_5자_이하여야_한다() {
		assertThatNoException().isThrownBy(()-> new CarName("asdr"));
		assertThatNoException().isThrownBy(()-> new CarName("asdra"));
		assertThatIllegalArgumentException().isThrownBy(()->new CarName("asdras"));
	}

	@Test
	void 차이름이_공백이_발생할경우_에러가_나타난다() {
		assertThatIllegalArgumentException().isThrownBy(()->new CarName(null));
		assertThatIllegalArgumentException().isThrownBy(()->new CarName(""));
	}
}
