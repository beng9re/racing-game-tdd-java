package racinggame.domain;

import static org.assertj.core.api.Assertions.*;


import org.junit.jupiter.api.Test;


public class CarTest {


	@Test
	void 차의_이름의_길이가_5자_이하여야_한다() {
		assertThatNoException().isThrownBy(()-> new CarName("asdr"));
		assertThatNoException().isThrownBy(()-> new CarName("asdra"));
		assertThatIllegalStateException().isThrownBy(()->new CarName("asdras"));
	}

	@Test
	void 차이름이_공백이_발생할경우_에러가_나타난다() {
		assertThatIllegalStateException().isThrownBy(()->new CarName(null));
		assertThatIllegalStateException().isThrownBy(()->new CarName(""));
	}

	@Test
	void 차이름을_가지는_차를_생성된다() {
		String carName = "aaas";
		Car aaasCar = new Car(new CarName(carName));
		assertThat(aaasCar.carName).isNotNull();
		assertThat(new CarName(carName)).isEqualTo(aaasCar.carName);
	}

}
