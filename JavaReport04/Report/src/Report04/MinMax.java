package Report04;
import java.util.Scanner;

public class MinMax {
    Scanner sc = new Scanner(System.in);
    int a,b;
    int max, min;

    public static void main(String[] args) {
        MinMax M = new MinMax(); //객체생성
        M.run();
    }

    private void run () { //흐름제어용 메서드 호출
        intakeData();
        Compare();
        print();
    }

    void intakeData() { //데이터 입력용 메서드
        System.out.printf("숫자 2개를 입력하시오: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void Compare() { //비교 메서드
        if (a < b) { //a가 b보다 작으면 max는 b min은 a
            max = b;
            min = a;
        }else if (a > b) { //a가 b보다 크면 max는 a min은 b
            max = a;
            min = b;
        }
    }

    void print() { //출력용 메서드
        System.out.printf("a : %d\n", a);
        System.out.printf("b : %d\n", b);
        System.out.println("큰 수는 " + max + "이며");
        System.out.println("작은 수는 " + min + "입니다");
    }
}
