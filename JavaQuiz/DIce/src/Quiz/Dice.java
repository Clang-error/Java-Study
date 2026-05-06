package Quiz;

import java.util.Random;

public class Dice {
    private final Random r = new Random();
    private final int[] diceValues = new int[6];
    private int a;

    public void intakeDice(int input) {
        a = input;
    }

    public void rollDice() {
        for (int i = 0; i < a; i++) {
            int dice = r.nextInt(6) + 1;
            diceValues[dice - 1]++;
        }
    }

    public void printDice() {
        for (int i = 0; i < diceValues.length; i++) {
            System.out.printf("[ %d의 눈금 ]: %d\n", i + 1, diceValues[i]);
        }
    }
}