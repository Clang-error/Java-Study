package Report04;
import java.util.Scanner;

public class Triangle {
    Scanner sc = new Scanner(System.in);
    int a,b,c;

    public static void main(String[] args) {
        Triangle T = new Triangle();
        T.run();
    }

    void run() {
        intakeData(); //intakeData만 호출하고 print 메서드는 intakeData 메서드 내에서 호출
    }

    void intakeData() { //while문을 사용
        while(true) { //반복문 선언
            System.out.printf("1~20사이의 수를 입력하세요: ");
            a = sc.nextInt();
            if(a==0) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);}//0을 입력하면 exit를 이용해 프로그램 종료
            else if(a<1 || a>20) {System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");}
            else {print();} //while문 반복을 위해 print메서드를 intakeData에서 호출
        }
    }

    void print() {
        for(int i=1;i<=a;i++) {//입력받은 데이터 만큼 반복
            for(int j=a-i;j>0;j--) { // i가 0이면 목표한 반복횟수를 채울 수 없음
                //j는 입력받은 데이터에서 a를 뺀값 *을 공백뒤에 출력해야하기에 이 구조를 사용
                System.out.print(" "); //a-i값만큼 계속 공백 반복
            }
            for(int k=1;k<=i;k++) { // k를 i번 반복하여 *을 찍음
                System.out.print("*");
            }
            System.out.println(); // 한번 반복을 했으면 줄 넘김.ㅁ
        }
    }

}


