package Report05; //객체지향 원칙을 지켜 다시 한번 만들어본 코드
import java.util.Scanner;
import java.util.Random;

public class HighLowGame2 {
    public static void main(String[] args) {
        GameView view = new GameView();
        GameController controller = new GameController();
        String isCorrect="True";

        while (!isCorrect.equals("CORRECT")) {
            int guess = view.getGuess(controller.getLow(), controller.getHigh());
            isCorrect = controller.checkGuess(guess);

            if (isCorrect.equals("OUT")) {
                view.displayMessage("종료되었습니다. 난수는 " + controller.getRandom());
                return; //out일때 프로그램 종료
            } else if (isCorrect.equals("OUT_OF_RANGE")) {
                view.displayMessage("범위를 벗어났습니다. 다시 시도하세요.");
            } else if (isCorrect.equals("CORRECT")) {
                view.displayMessage("정답입니다! 난수는 " + controller.getRandom()); //자동종료
            }
        }
    }
}

class GameView { //입력과 출력만 아는 클래스
    private Scanner sc = new Scanner(System.in);

    public int getGuess(int min, int max) {
        System.out.printf("[%d]-[%d]", min, max);
        return sc.nextInt();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

class GameController { //난수와 범위확인만 할줄아는 메서드
    private final int random;
    private int high = 100;
    private int low = 1;
    private int attempts = 0;
    private final int MAX_ATTEMPTS = 6;

    public GameController() {
        random = new Random().nextInt(1,101);
    }

    public int getHigh () {return high;}
    public int getLow () {return low;}
//    public int getAttempts () {return attempts;}
    public int getRandom () {return random;}

    String checkGuess(int guess) {
        attempts++;
        if (attempts > MAX_ATTEMPTS) {
            return "OUT";
        }
        System.out.println(random);
        if (guess > high || guess < low) {
            return "OUT_OF_RANGE";
        }
        if (guess == random) {return "CORRECT";}
        if (guess > random) {
            high = guess - 1;
        } else
            low = guess + 1;
        return "CONTINUE"; //컴파일 보장용 리턴문
    }
}
