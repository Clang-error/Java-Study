package retest;
import java.util.Scanner;

public class DoorsEx {
    public static void main(String[] args) {
        Door d = new Door();
        Number n = new Number();
        int[] arr = d.setDoor();
        while (true) {
            System.out.printf("[");
            for (int i = 0; i<arr.length; i++) {
                System.out.printf("%d",arr[i]);
                if (i != arr.length-1) System.out.print(", ");
            }
            System.out.println("]");
            System.out.printf("Enter Door NO(1~10):");
            int num = n.getNumber();
            if (num == 0) {
                System.out.println("Thanks");
                break;
            } else if(num < 0 || num > arr.length) {
                System.out.printf("You Should enter only %d~%d(0:exit)\n",0,arr.length);
                continue;
            }

            if (arr[num-1] == 1) {
                arr[num-1] = 0;
            }else
                arr[num-1] = 1;
            }
        }
    }

class Number {
    Scanner sc = new Scanner(System.in);
    int getNumber() {
        return sc.nextInt();
    }
}

class Door {
    private final int Doors = 20;
    private final int[] arrDoor = new int[Doors];
    int[] setDoor() {
        for (int i = 0; i< Doors; i++) {
            for (int j = 0; j< Doors /2; j++) {
                arrDoor[j] = 1;
            }
        }
        return arrDoor;
    }
}