package racinggame.view;

import racinggame.domain.Winners;

public class OutPutView {
	private final static String RESULT_MESSAGE = "실행결과";

	public void printResult() {
		System.out.println(RESULT_MESSAGE);
	}

	public void winnerPrint(Winners winners) {
		System.out.println(new StringBuilder("최종 우승자는 ")
			.append(winners)
			.append(" 입니다."));
	}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printNewLine() {
		System.out.println();
	}
}
