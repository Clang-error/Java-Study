package ch03; //한글찍기

public class Literals {
    public static void main(String[] args) {
//      char ch='\uAC00';
        char ch='\u0061';
        System.out.println(ch);
        System.out.println((int)ch); //코드값
        for (int i = 0; i < 26; i++) {
            System.out.print((char)(ch+i));
            if ((i+1)%30==0) System.out.println();
        }
    }
}
