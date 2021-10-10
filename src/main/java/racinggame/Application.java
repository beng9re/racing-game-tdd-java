package racinggame;

import racinggame.view.InputView;

public class Application {
    public static void main(String[] args) {
        new RacingGameController(new InputView()).play();
    }
}
