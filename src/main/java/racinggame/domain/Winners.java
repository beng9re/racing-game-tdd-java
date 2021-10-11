package racinggame.domain;

import java.util.List;

public class Winners {
	private static final  String COMMA = ",";
	private List<Car> winners;
	public Winners(Cars cars) {
		winners = cars.positionMaxCarList();
	}

	@Override
	public String toString() {
		StringBuilder winner = new StringBuilder();
		for (int i = 0; i < winners.size(); i++) {
			winner.append(winners.get(i).carName());
			if (i != winners.size() - 1) {
				winner.append(COMMA);
			}
		}
		return winner.toString();
	}
}
