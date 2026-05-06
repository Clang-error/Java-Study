package ch04;

import java.util.Random;

public class Dice {
    private int faces;
    private final Random r = new Random();
    int rolling() {
        //face = {1~6사이의 숫자}
        faces = r.nextInt(6) + 1;
        return faces;
    }
}

class Dices {
    Dice dice = new Dice();
    Dice dice2 = new Dice();
    private int face;
    private int face2;

    void rolling() {
        face = dice.rolling();
        face2 = dice2.rolling();

    }

    int getSum() {
        return face + face2;
    }

    public String toString() {
        return String.format("%d + %d = %d", face, face2, getSum());
    }
}
