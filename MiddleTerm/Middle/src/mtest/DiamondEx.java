package mtest;

import java.util.Scanner;

public class DiamondEx {
    public static void main(String[] args) {
        getNumber gn = new getNumber();
        Diamond d = new Diamond();

        while(true) {
            int num = gn.getnum();
            if (num == 0) {
                System.out.println("Thanks.");
                break;
            }
            d.printDiamond(num);

        }
    }
}

class getNumber {
    Scanner sc = new Scanner(System.in);
    private int num;
    public int getnum() {
        System.out.printf("숫자를 입력하세요: ");
        num = sc.nextInt();
        return num;
    }
}

class Diamond {
    void printDiamond(int value) {
        if (value % 2 == 0) {
            value--;
        }
        System.out.println(value);
        int mid = value / 2;
        for (int i = 0; i < value; i++) {
            int starCount;
            int spaceCount;

            if (i <= mid) {
                starCount = 2 * i + 1;
                spaceCount = mid - i;
            } else {
                starCount = 2 * (value - i - 1) + 1;
                spaceCount = i - mid;
            }

            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
