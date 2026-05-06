package ch04;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                System.out.println("You entered: "+num);
                break;
            }catch(Exception e) {
                System.out.println("Invalid input");
                sc.nextLine();
            }
        }
    }
}
