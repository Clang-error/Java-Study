package ch04;

public class DiceEx {

    void run() {
        Dices dices = new Dices();
        int[] counts = new int[13];
        for (int i = 0; i < 100; i++) {
            dices.rolling();
            System.out.println(dices);
            counts[dices.getSum()]++;
        }
        for (int i = 2; i < 13; i++) {
            System.out.print(String.format("%2d : %2d " ,i, counts[i]));
            for (int j = 0; j < counts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DiceEx diceEx = new DiceEx();
        diceEx.run();
    }

}
