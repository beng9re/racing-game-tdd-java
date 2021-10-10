package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarsTest {
	Cars cars;

	@BeforeEach
	void setup() {
		cars = new Cars("sads,sad,asdr,fgvs,asdd");
	}

	@Test
	void 쉼표로_구분으로_문자열을_받아_자동차들을_생성한다() {
		String carNameString = "sads,sad,asdr,fgv,asdd";
		String[] carsName = carNameString.split(",");
		Cars cars = new Cars(carNameString);
		assertThat(cars).isNotNull();
		assertThat(cars.size() == carsName.length).isTrue();
		for (int i = 0; i < cars.size(); i++) {
			assertThat(cars).isNotNull();
			assertThat(cars.getCar(i).carName()).isEqualTo(carsName[i]);
		}
	}

	@ParameterizedTest
	@ValueSource(strings = {
		"sads,sad,asdr,fgvs,asdd,",
		"sads,sad,asdr,fgv,asddssa",
		"sads,sad,asdr,fgv,,",
		"sads,sad,,asdr,fgv,"
	})
	void 잘못된_차이름_유효성검사(String carNames) {
		assertThatIllegalArgumentException().isThrownBy(() -> new Cars(carNames));
	}

	@Test
	void 도착거리가_최대인_차를_찾는다() {
		List<Car> maxCar = cars.positionMaxCarList();
		cars.getCar(1).move();
		cars.getCar(2).move();
		assertThat(maxCar.get(0).carName()).isEqualTo("sad");
		assertThat(maxCar.get(1).carName()).isEqualTo("asdr");
	}

	@Test
	void 모두가_안움직일_경우_모두가_최대이다() {
		assertThat(cars.positionMaxCarList().size() == cars.size()).isTrue();
	}

}
