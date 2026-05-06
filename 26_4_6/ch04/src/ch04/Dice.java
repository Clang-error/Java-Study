package ch04;
import java.util.Random;

public class Dice {
    private int face;
    Random r = new Random();

    public Dice() {
    }

    int getFace() {
        return face;
    }

    void rolling() {
        face = r.nextInt(6) + 1;
    }

    public String toString() {
        return "Dice face is " + face;
    }
}