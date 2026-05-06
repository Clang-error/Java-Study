package mtest;

import java.util.Scanner;

public class TriangleEx {

    public static void main(String[] args) {
        Number n = new Number();
        boolean isTriangle = true;
        while(isTriangle == true) {
            n.getnum();
            n.print();
            isTriangle = n.isTriangle();
        }
    }
}
class Number {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    void getnum() {
        System.out.printf("Input 3 Numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }

    boolean isTriangle() {
        if (a ==0 || b ==0 || c ==0) {
            System.out.println("Thanks.");
            return false;
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("삼각형 아님");
        } else if (a == b && b == c) {
            System.out.println("정삼각형");
        } else if (isRightTriangle(a, b, c)) {
            System.out.println("직각삼각형");
        } else if (a == b || a == c || b == c) {
            System.out.println("이등변삼각형");
        } else {
            System.out.println("일반삼각형");
        }
        return true;
    }
    void print() {
        System.out.println("[" + a + ", " + b + ", " + c + "]");
    }

    private static boolean isRightTriangle(int a, int b, int c) {
        int[] arr = {a, b, c}; //직각삼각형검증
        java.util.Arrays.sort(arr);

        return arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2];
    }
}
