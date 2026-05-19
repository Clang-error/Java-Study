package mtest;

import java.util.Objects;
import java.util.Random;

public class YootEx {

    public static void main(String[] args) {
        SetYoot sy = new SetYoot();
        GetYootValue gvy = new GetYootValue();
        int[] SticksValue = new int[5];
        int count = 1;
        while(count <= 100) {
            System.out.print("[");
            String[] yoots = sy.setYoots();
            SticksValue = gvy.value(yoots);
            for (int i = 0; i < 4; i++) {
                System.out.print(yoots[i]);
            }
            System.out.print("]");
            if (count % 10 == 0) {
                System.out.println();
            }
            count++;
        }
        System.out.printf("도[%2d] :",SticksValue[0]);
        for (int i = 0; i < SticksValue[0]; i++) System.out.print("*");
        System.out.println();
        System.out.printf("개[%2d] :",SticksValue[1]);
        for (int i = 0; i < SticksValue[1]; i++) System.out.print("*");
        System.out.println();
        System.out.printf("걸[%2d] :",SticksValue[2]);
        for (int i = 0; i < SticksValue[2]; i++) System.out.print("*");
        System.out.println();
        System.out.printf("윷[%2d] :",SticksValue[3]);
        for (int i = 0; i < SticksValue[3]; i++) System.out.print("*");
        System.out.println();
        System.out.printf("모[%2d] :",SticksValue[4]);
        for (int i = 0; i < SticksValue[4]; i++) System.out.print("*");

    }
}
class SetYoot {
    Random r = new Random();
    String[] yoots = new String[4];
    public String[] setYoots() {
        for (int i = 0; i < 4; i++) {
            if (r.nextInt(100) < 55) {
                yoots[i] = "O";
            } else {
                yoots[i] = "X";
            }
        }
        return yoots;
    }
}

class GetYootValue {
    private int xcount = 0;
    private int[] Sticks = new int[5];
    int[] value(String[] yoots) {
        xcount = 0;
        for (int i = 0; i < 4; i++) {
            if (Objects.equals(yoots[i], "X")) {
                xcount++;
            }
        }
        if (xcount == 1) {
            Sticks[0] += 1;
        } else if (xcount == 2) {
            Sticks[1] += 1;
        } else if (xcount == 3) {
            Sticks[2] += 1;
        } else if (xcount == 4) {
            Sticks[3] += 1;
        } else {
            Sticks[4] += 1;
        }
        return Sticks;
    }
}
