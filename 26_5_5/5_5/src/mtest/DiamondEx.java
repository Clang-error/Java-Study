package mtest;
import java.util.Scanner;

class Diamond {
    private int row;
    void setRow(int row) {
        this.row =(row%2==0)?row+1:row;
    }

    int getRow() {
        return row;
    }

    int abs(int n){
        return (n<0)?-n:n;
    }

    String repeat(String s, int count) {
        String str="";
        for (int i = 0; i<count;i++) {
            str+=s;
        }
        return str;
    }

    public String toString() {
        String dia="";
        for (int i = 0; i<row;i++) {
            dia+=repeat(" ",abs(row/2-i));
            dia+=repeat("*", row-abs(row/2-i)*2);
            dia+="\n";
        }

        return dia;
    }


}


public class DiamondEx {
    Scanner in=new Scanner(System.in);
    Diamond dia=new Diamond();
    public DiamondEx() {
        System.out.print("Enter a number(0 to exit):");
        int n=in.nextInt();
        while (n != 0) {
            dia.setRow(n);
            System.out.println(dia.getRow()+" Row의 다이아몬드 출력");
            System.out.println(dia);
            System.out.println("Enter a number(0 to exit):");
            n=in.nextInt();
        }
        System.out.println("Thanks");
    }

    public static void main(String[] args) {
        new DiamondEx();
    }
}

