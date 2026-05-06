package ch04;
import java.util.Random;

public class RainEx {
    int rate;
    Random r = new Random();
    boolean result;
    public RainEx() {
        for(int i=0;i<100;i++) {
            if(isRaining()) {
                System.out.println("It's raining");
            }
            else {
                System.out.println("It's not raining");
            }
        }
    }
// 어떤점수가 발생되는데 60점에서 100점 사이가 80퍼
    boolean isRaining() {
        rate=r.nextInt(1,101);
        if(rate>21) {
            result = true;
        } else {
            result = false;
        } return result;
    }

    public static void main(String[] args) {
        RainEx ex = new RainEx();
    }
}
