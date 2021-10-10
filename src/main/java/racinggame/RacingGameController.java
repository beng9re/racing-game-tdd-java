package racinggame;

import racinggame.view.InputView;

public class RacingGameController {
	InputView inputView;

	public RacingGameController(InputView inputView) {
		this.inputView = inputView;
	}

	public void play() {
		inputView.inputCarNames();
		inputView.inputTryCount();

	}
}
