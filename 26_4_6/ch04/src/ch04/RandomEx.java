package ch04;
import java.util.Random;

public class RandomEx {
    Random r = new Random();
    int num;

    public RandomEx() {
        for(int i=0;i<100;i++) {
            num = r.nextInt(6)+1;
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        new RandomEx();
    }
}
