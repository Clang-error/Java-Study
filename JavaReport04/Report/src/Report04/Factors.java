package Report04;
import java.util.Scanner;

public class Factors {
    Scanner sc = new Scanner(System.in);
    int a; //필드 멤버 선언
    int[] factors;
    int sum = 0;
    int count = 0;

    public static void main(String[] args) {
        Factors f = new Factors();//객체 생성
        f.run(); //실행로직 별도분리
    }

    private void run() {
        intakeData();
        factorCalc();
        print();
    }

    void intakeData() {
        System.out.printf("정수 하나를 입력하시오: ");
        a = sc.nextInt();
        factors = new int[a]; //입력받은 a값만큼 배열사이즈 초기화

    }

    void factorCalc() {
        for (int i = 1; i <= a; i++) { //a값 만큼 for문을돌
            if ((a % i) == 0) {
                // a를 i 로 나눴을떄 나머지가 0이되는 것이 약수.
                factors[count] = i;
                sum += i;//합값
                count++;
                //a가 1로 시작하기때문에 count에 증감연산자를 사용하여 베열저장위치를 지정
            }
        }

    }

    void print() {
        System.out.printf(a + "의 약수는 ");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d ", factors[i]);
        }System.out.println("이며 합은: "+sum+"입니다");
    }
}
