//package Scanner;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//public class Pr1 {
//    int InputInteger() {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int num3;
//        while(true) {
//            try {
//                num3 =in.nextInt();
//                break;
//            }
//            catch (InputMismatchException e) {
//                System.out.println("Please enter a number");
//                in.next(); //키보드에서 받은 값 버리기
//            }
//        }
//        in.close();
//        return num1+num2+num3;
//    }
//    public static void main(String[] args) {
//        int num = new InputEx();
//        System.out.println(num);
//    }
//}
//
//public class InputEx {
//    int num = new Pr1().InputInteger();
//} //이름 주소 나이 평점(실수) 입력받아서 출력하는 프로ㄱ램을 만들어라