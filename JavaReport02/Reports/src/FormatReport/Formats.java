package FormatReport;

public class Formats {
    double A = 1234.567;
    int B = 87;
    int C = 65;

    class Student { //중첩클래스로 C언어에서 사용되는 구조체 처럼 구현
        String name;
        int score;
        int score2;

        Student(String name, int score, int score2) {
            this.name = name;
            this.score = score;
            this.score2 = score2;
        }
    }


    public static void main(String[] args) {
        new Formats();
    }

    public Formats() {
        floatPrint();
        intPrint();
        scorePrint();
    }

    void floatPrint() {
        System.out.printf("|%10.2f|\n",A);// 10칸을 확보하고 소수점 두번쨰자리가까지 (기본 오른쪽정렬)
        System.out.printf("|%-10.2f|\n",A);//%10에 - 를 붙이면 왼 쪽으로 정렬합니다
    }

    void intPrint() {
        System.out.println();
        System.out.printf("|%4d%4d|\n",B,C);
        System.out.printf("|%5d%5d|\n",B,C);
    }

    void scorePrint() {
        Student s1 = new Student("HyeonSeok GO", 90, 92); //생성자를 호출하여 원하는 값 입력
        Student s2 = new Student("JinWoo Kim", 95, 100);

        System.out.println();
        System.out.printf("|Name%11skor Eng Tot  Aver|\n","");
        System.out.printf("|%s%6d%4d%4d%6.1f|\n",s1.name,s1.score,s1.score2,s1.score + s1.score2,(float)(s1.score + s1.score2)/2);
        System.out.printf("|%s%8d%4d%4d%6.1f|",s2.name,s2.score,s2.score2,s2.score + s2.score2,(float)(s2.score + s2.score2)/2);
    }
}

