package Scanner;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputTest {
    Scanner in = new Scanner(System.in);
    String name;
    String address;
    int age;
    double avg;

    public static void main(String[] args) {
        new InputTest();
    }

    public InputTest() {
        getvalule();
        printValue();
    }

    void getvalule() {
        System.out.print("이름을 입력하시오: ");
        name = in.nextLine();
        System.out.print("주소를 입력하시오: ");
        address = in.nextLine();
        System.out.print("나이를 입력하시오: ");
        while(true) {
            try {
                age =in.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                in.next(); //키보드에서 받은 값 버리기
            }
        }
        System.out.print("평점을 입력하시오: ");
        while(true) {
            try {
                avg =in.nextFloat();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                in.next(); //키보드에서 받은 값 버리기
            }
        }
    }

    void printValue() {
        System.out.println("\n이름: " + name);
        System.out.println("주소: " + address);
        System.out.println("나이: " + age );
        System.out.printf("평점: %.1f\n",avg );
    }

}
