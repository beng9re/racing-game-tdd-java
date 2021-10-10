package racinggame;

import racinggame.view.InputView;
import racinggame.view.OutPutView;

public class Application {
	@SuppressWarnings("checkstyle:RegexpSingleline")
	public static void main(String[] args) {
		InputView inputView = new InputView();
		OutPutView outPutView = new OutPutView();

		RacingGameService racingGameService = new RacingGameService();

		RacingGameController racingGameController = new RacingGameController(
			inputView, outPutView, racingGameService
		);
		racingGameController.play();
	}
}
