package racinggame;

import nextstep.utils.Randoms;
import racinggame.domain.Cars;
import racinggame.domain.Winners;

public class RacingGameService {

	public Cars carsCreate(String carNames) {
		return new Cars(carNames);
	}

	public String racing(Cars cars) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < cars.size(); i++) {
			cars.getCar(i).racing(Randoms.pickNumberInRange(0, 9));
			stringBuilder.append(cars.getCar(i));
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}

	public Winners winner(Cars cars) {
		return new Winners(cars);
	}
}
