package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

	private Car car;

	@BeforeEach
	void setUp(){
		car = new Car("자동차");
	}

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

	@Test
	void 차이름을_가지는_차를_생성된다() {
		String carName = "aaas";
		Car aaasCar = new Car(carName);
		assertThat(aaasCar.carName).isNotNull();
		assertThat(new CarName(carName)).isEqualTo(aaasCar.carName);
	}

	@Test
	void 차가_전진한다() {
		car.move();
		assertThat(car.carPosition).isEqualTo(new CarPosition(1));
	}


	@Test
	void 특정숫자가_4이상이면_차가전진_한다() {
		car.racing(0);
		assertThat(car.carPosition).isEqualTo(new CarPosition(0));
		car.racing(3);
		assertThat(car.carPosition).isEqualTo(new CarPosition(0));
		car.racing(4);
		assertThat(car.carPosition).isEqualTo(new CarPosition(1));
		car.racing(5);
		assertThat(car.carPosition).isEqualTo(new CarPosition(2));
	}



	@Test
	void 자동차의_현재상태를_출력한다() {
		assertThat(car.toString()).isEqualTo("자동차 : ");
		car.move();
		assertThat(car.toString()).isEqualTo("자동차 : -");
	}



}
