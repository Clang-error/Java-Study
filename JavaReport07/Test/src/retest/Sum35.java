package retest;

public class Sum35 {

    public static void main(String[] args) {
        Sum351 s = new Sum351();
        int i;
        int sum = 0;
        int count = 0;
        int total_Count = 0;
        double avg = 0;
        for (i = 1; i<=100; i++) {
            int compare = sum;
            sum += s.check(i);
            if (compare == sum) continue;
            else {count++; total_Count++;}
            System.out.printf("%3d",i);
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
        avg = (double)sum / total_Count;
        System.out.println("\n합계는 "+sum+" 이고 평균은 "+avg+" 입니다.");

    }
}

class Sum351 {
    int check(int a) {
        if (a % 3 == 0 || a % 5 == 0) return 0;
        else return a;
    }

}
