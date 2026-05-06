package Quiz;

import java.util.Scanner;

public class DiceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();

        while (true) {
            System.out.printf("6~600사이의 수를 입력해주세요. (0 입력시 종료) : ");
            int a = sc.nextInt();

            if (a == 0) {
                System.out.println("시스템을 종료합니다");
                System.exit(0);
            }

            if (a < 6 || a > 600) {
                System.out.println("6~600사이의 수를 입력해주세요.");
                continue;
            }

            dice.intakeDice(a);
            dice.rollDice();
            dice.printDice();
            break;
        }
    }
}