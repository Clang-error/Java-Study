package Report05;
import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
    private int randomNumber; //랜덤 변수
    private int guess; //사용자 입력변수
    private int low=1; //최솟값
    private int high=100; //최대값

    public static void main(String[] args) {
        HighLowGame game = new HighLowGame(); //객체생성,참조변수 이름을 Game으로 선언
        game.play(); //참조변수 game의 play 메서드 호출
    }

    public void play() {
        generateRandomNumber();
        checkGuess();
    }

    void generateRandomNumber() {
        randomNumber = new Random().nextInt(1,101); //1부터 100까지 사이의 난수 생성
//        System.out.println("난수 생성 완료: " + randomNumber); //테스트 확인용
    }

    void intakeGuess() {  // checkGuess 메서드에서 호출됨
        guess = new Scanner(System.in).nextInt(); // 추측값 입력
    }

    void checkGuess() {
        int i = 0;
        while(true) {
            i++; //선 증가
            if(i == 7) { //6번 반복 후 7번이 되었을 때 프로그램 종료
                System.out.println("당신이 졌습니다!"); //찾지 못했을 시 난수번호 출력후 프로그램 종료
                System.out.println("히든 수는 " + randomNumber +" 였습니다.");
                return;
            }
            System.out.printf("[%d]-[%d] ", low, high);
            intakeGuess();
            if (guess >high || guess < low) { //입력값이 최대와 최소의 범위를 넘어가는지 체크
                System.out.println("범위를 벗어났습니다.");
                continue;
            }

            if(guess > randomNumber) { //추측한 값이 난수보다 크다면 최대값을 추측값에서 -1 작게 설정
                high = guess-1;
            }else if(guess < randomNumber) { //추측한 값이 난수보다 작으면 최소값을 추측값에서 +1 크게 설정
                low = guess + 1;
            }else { //맞췄을시 난수번호 출력
                System.out.println("당신이 이겼습니다!");
                System.out.println("축하합니다! 히든수는 " + randomNumber +" 였습니다." );
                return;
            }
        }
    }
}
