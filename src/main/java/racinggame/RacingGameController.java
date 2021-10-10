package racinggame;

import racinggame.domain.Cars;
import racinggame.view.InputView;
import racinggame.view.OutPutView;

public class RacingGameController {
	private final InputView inputView;
	private final OutPutView outPutView;
	private final RacingGameService racingGameService;
	public RacingGameController(InputView inputView, OutPutView outPutView,RacingGameService racingGameService) {
		this.inputView = inputView;
		this.outPutView = outPutView;
		this.racingGameService = new RacingGameService();
	}

	public void play() {
		String carNames = inputView.inputCarNames();
		Cars cars = racingGameService.carsCreate(carNames);

		int tryPlay = inputView.inputTryCount();
		outPutView.printNewLine();
		outPutView.printResult();
		for (int i = 0; i < tryPlay; i++) {
			outPutView.printMessage(racingGameService.racing(cars));
		}
		outPutView.winnerPrint(racingGameService.winner(cars));
	}
}
