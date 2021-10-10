package racinggame.domain;



import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WinnersTest {
	Cars cars;
	@BeforeEach
	void setUp(){
		cars = new Cars("POBI,KIM,NAME");
		cars.getCar(0).move();
		cars.getCar(1).move();
	}

	@Test
	void 우승자의_이름을_출력한다() {
		assertThat(new Winners(cars).toString()).isEqualTo("POBI,KIM");
		cars.getCar(0).move();
		assertThat(new Winners(cars).toString()).isEqualTo("POBI");


	}
}