package ch04;

public class DiceEx {
    Dice dice = new Dice();

    public DiceEx() {
        for(int i = 0; i < 100; i++) {
            dice.rolling();
//            dice.face = 7;
            System.out.println(dice);
        }
    }

    public static void main(String[] args) {
        new DiceEx();
    }
}
