package racinggame.view;

import java.util.function.Function;

import nextstep.utils.Console;
import racinggame.util.StringUtils;
import racinggame.util.ValidationStatus;
import racinggame.util.ValidationUtils;

public class InputView {

	private static final String INPUT_MESSAGE_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String INPUT_MESSAGE_TRY_COUNT = "시도할 회수는 몇회인가요?";

	public String inputCarNames() {
		return inputValidCommand(INPUT_MESSAGE_CAR_NAME, ValidationUtils::nameValid);
	}

	public int inputTryCount() {
		return Integer.parseInt(
			inputValidCommand(INPUT_MESSAGE_TRY_COUNT, ValidationUtils::validNumber)
		);
	}

	private String inputCommand(String inputMessage) {
		inputMessage = StringUtils.ifNullGetEmpty(inputMessage);
		System.out.println(inputMessage);
		return Console.readLine();
	}

	private String inputValidCommand(String inputMessage, Function<String, ValidationStatus> valid) {
		String input = "";
		input = inputCommand(inputMessage);
		ValidationStatus status = valid.apply(input);
		while (!ValidationStatus.OK.equals(status)) {
			System.out.println(StringUtils.ifNullGetEmpty(status.getMessage()));
			input = inputCommand(inputMessage);
			status = valid.apply(input);
		}
		return input;
	}



}
