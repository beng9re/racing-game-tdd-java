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
	void 차이름을_가지는_차를_생성된다() {
		String carName = "aaas";
		Car aaasCar = new Car(carName);
		assertThat(aaasCar.carName()).isNotNull();
		assertThat(new CarName(carName)).isEqualTo(aaasCar.getCarName());
	}

	@Test
	void 차가_전진한다() {
		car.move();
		assertThat(car.getCarPosition()).isEqualTo(new CarPosition(1));
	}


	@Test
	void 특정숫자가_4이상이면_차가전진_한다() {
		car.racing(0);
		assertThat(car.getCarPosition()).isEqualTo(new CarPosition(0));
		car.racing(3);
		assertThat(car.getCarPosition()).isEqualTo(new CarPosition(0));
		car.racing(4);
		assertThat(car.getCarPosition()).isEqualTo(new CarPosition(1));
		car.racing(5);
		assertThat(car.getCarPosition()).isEqualTo(new CarPosition(2));
	}

	@Test
	void 자동차의_현재상태를_출력한다() {
		assertThat(car.toString()).isEqualTo("자동차 : ");
		car.move();
		assertThat(car.toString()).isEqualTo("자동차 : -");
	}

	@Test
	void 다른자동차와_거리를_기준으로_경쟁() {
		Car car = new Car("자동차");
		Car car2 = new Car("자동차2");
		assertThat(car.compete(car2)).isEqualTo(CarPositionCompareStatus.SAME);
		car2.move();
		assertThat(car.compete(car2)).isEqualTo(CarPositionCompareStatus.SMALL);
		car.move();
		car.move();
		assertThat(car.compete(car2)).isEqualTo(CarPositionCompareStatus.BIG);
	}
}
