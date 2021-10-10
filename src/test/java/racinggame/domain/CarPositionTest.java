package racinggame.domain;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CarPositionTest {

	@Test
	void 자동차_위치는_음수를_가질수_없다() {
		assertThatIllegalArgumentException().isThrownBy(() -> new CarPosition(-1));
		assertThatIllegalArgumentException().isThrownBy(() -> new CarPosition(3).add(-4));
		assertThatNoException().isThrownBy(()->new CarPosition(3));

	}

	@Test
	void 자동차의_거리를_마이너스_기호_로_치환한다() {
		assertThat(new CarPosition(3).toString()).isEqualTo("---");
		CarPosition forPosition = new CarPosition(4);
		forPosition.add(1);
		assertThat(forPosition.toString()).isEqualTo("-----");
	}

}
