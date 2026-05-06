package retest;
import java.util.Scanner;


public class PrimeNumeber {
    private int num;
    public static void main(String[] args) {
        getNumber gn = new getNumber();
        while (true) {
            System.out.printf("Input Number[0:quit]:");
            int num = gn.Number();

            if (num == 0) {
                System.out.println("Thanks.");
                break;
            }

            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.printf("%d = %d x %d\n", num, i, num / i);
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("It's Prime Number.");
            }
        }
    }
}

class getNumber {
    Scanner sc = new Scanner(System.in);
    int Number() {
        return sc.nextInt();
    }
}