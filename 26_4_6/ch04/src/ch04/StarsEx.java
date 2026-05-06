package ch04;
import java.util.Scanner;

public class StarsEx {
    Scanner sc = new Scanner(System.in);
    int num=0;

    public StarsEx() {
        num = sc.nextInt();
        while(num!=0) {
            num = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        new StarsEx();
    }
}
