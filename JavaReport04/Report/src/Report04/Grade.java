package Report04;
import java.util.Scanner;

public class Grade {
    int[] arr = new int[5]; // 5개의 배열을 가진 arr 선언 지정된 개수의 수의 개수를 저장하기위함
    //new int 로 새 배열을 선언하면 0으로 초기화됨
    int a;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Grade g = new Grade();
        g.run();
    }

    void run() {
        intakeDataCompare();
        print();
    }

    void intakeDataCompare() {//데이터를 입력받고 비교하는 메서드
        while(true) { //반복문 선언
            a = sc.nextInt();
            if (a==0) return; //return으로 원래 print()로 이동 run함수로 흐름이 제어되고 있기 떄문에 print로 이동함
            if (a>=1 && a<=20) arr[0] +=1; // a가 1~20 사이일 경우 arr[0]에 1을 더함
            else if (a>=21 && a<=40 ) arr[1] +=1; // a가 21~40 사이일 경우 arr[1]에 1을 더함
            else if (a>=41 && a<=60 ) arr[2] +=1; // a가 41~60 사이일 경우 arr[2]에 1을 더함
            else if (a>=61 && a<=80 ) arr[3] +=1; // a가 61~80 사이일 경우 arr[3]에 1을 더함
            else if (a>=81 && a<=100 ) arr[4] +=1;// a가 81~100 사이일 경우 arr[4]에 1을 더함 ㅁ
        }
    }

    void print() {
        System.out.println("1 ~ 20의 개수: "+arr[0]);
        System.out.println("21 ~ 40의 개수: "+arr[1]);
        System.out.println("41 ~ 60의 개수: "+arr[2]);
        System.out.println("61 ~ 80의 개수: "+arr[3]);
        System.out.println("81 ~ 100의 개수: "+arr[4]);
    }
}
