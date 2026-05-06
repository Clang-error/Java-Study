package Report04;

public class Gugudan {
    int[][] arr = new int[9][9]; //2차원배열을 선언하여 9,9 사이즈 배열로 초기화
    public static void main(String[] args) {
        Gugudan G = new Gugudan();
        G.run();
    }

    private void run() {
        guguCalc();
        printAll();
        print3();
    }

    void guguCalc() { // 선언한 arr배열에 데이터 저장
        for (int i = 0; i<9; i++)  //9번 만큼 반복
            for (int j = 0; j<9; j++ ) { //9번만큼 반복
                arr[i][j] = (i + 1) * (j + 1); //arr[i][j]에 i+1과 j+1를 곱한 값을 저장
                //+1를 하는 이유는 반복문의 인덱스가 0부터 시작하기 때문에 곱할때는 1부터 시작해야하기 때문
                //이런식의 반복문은 첫 연산때 인덱스 0 0에 1을 저장, 그 다음에는 2 ...를 반복하며 i값과 j값을 곱하여 저장
            }
    }

    void printAll() { //(1)번 출력 메서드
        System.out.printf("   "); // 공백을 출력함
        for (int i = 1; i<=9; i++) //단순하게 1부터 9까지 출력하는 포문
            System.out.printf("%3d",i); //%3d만큼 공백을 준 후 출력
        System.out.println();//줄넘김

        for (int i = 0; i<9; i++) { // arr값에 저장된 데이터 출력하는 포문
            System.out.printf("%3d",i+1);
            for (int j = 0; j<9; j++) { //arr[i][j]값을 출력하는 포문
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
    }

    void print3() { //(2)번 출력 메서드
        System.out.println();
//        for (int i = 0; i<9; i++) { //너무 길음 한 포문안에 넣는 작업해보기
//            for (int j = 0; j<3; j++){
//                System.out.printf("%2d*%d=%2d ",j+1,i+1,arr[j][i]);
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i<9; i++) {
//            for (int j = 3; j<6; j++){
//                System.out.printf("%2d*%d=%2d ",j+1,i+1,arr[j][i]);
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i<9; i++) {
//            for (int j = 6; j<9; j++){
//                System.out.printf("%2d*%d=%2d ",j+1,i+1,arr[j][i]);
//            }
//            System.out.println();
//        }
        for (int start = 0; start < 9; start+=3) { //3번 연산 j에서 활용
            for (int i = 0; i<9; i++) {
                for (int j = start; j<start+3; j++) //j의 값을 start로 초기화, j가 start+3의 사이즈보다 작을때 까지.
                    //만약 start가 3이라면? j는 start+3사이보다 작을때까지 반복문을 돌림 그렇데되면 1~3 까지, 전체for문 한 번 돌리고 다시 4~6까지.
                    System.out.printf("%2dx%d=%2d",j+1,i+1,arr[j][i]);
                System.out.println();
            }
            System.out.println();
        }
    }
}
