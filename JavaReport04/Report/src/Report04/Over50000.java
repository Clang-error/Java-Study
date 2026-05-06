package Report04;

public class Over50000 {
    static final int MAX = 10000; //상수 최대값 선언 및 초기화
    int mul=1;
    int firstOver50000;
    int firstOver50000Product;

    public static void main(String[] args) {
            Over50000 O = new Over50000();
            O.run();
    }

    void run() {
        Calc();
        print();
    }

    void Calc() {
        for (int i = 1; i < MAX; i++) {
            mul *= i;
            if (mul > 50000) {
                firstOver50000 = i;
                firstOver50000Product = mul;
                break;
            }
        }
    }

    void print() {
        System.out.println("최초로 50000을 넘는 정수는 " + firstOver50000Product + "이며 곱한 수는 " + firstOver50000 +"입니다.");
    }
}
