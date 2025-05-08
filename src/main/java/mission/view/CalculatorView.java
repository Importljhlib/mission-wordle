package mission.view;

import java.util.Scanner;

public class CalculatorView {
    private final Scanner scanner;

    public CalculatorView() {
        this.scanner = new Scanner(System.in);
    }

    public String get_input() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        return scanner.nextLine();
    }

    public void display_result(int result) {
        System.out.println("결과 : " + result);
    }
}
