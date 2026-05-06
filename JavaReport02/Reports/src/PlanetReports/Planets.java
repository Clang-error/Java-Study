package PlanetReports;
import java.util.Scanner;

public class Planets {
    Scanner input = new Scanner(System.in);
    String planets; //인스턴스 변수 plants
    long distance; //입력받는 값이 21억을 넘어가는 게 있기때문에 long으로 선언

    public static void main(String[] args) {
        new Planets(); //new Planets() 하나만 선언하여 main을 깔끔하게 유지
    }

    public Planets() { //생성자
        getPlanets();
        distanceCalc();
        printPlanets();
    }

    void getPlanets() {
        System.out.printf("행성을 선택하세요(태양,수성,금성,화성,목성,토성,천왕성,해왕성): ");
        planets = input.nextLine();
    }

    void distanceCalc() {
        if ("태양".equals(planets)) {
            distance = 150000000L; // km, 기본 int형 정수로는 아래 천왕성부터 데이터를 담을 수없기에 distance를 long으로 선언한다
        } else if ("수성".equals(planets)) {
            distance = 92100000L; // 저장하는 값뒤에 L을붙여 L타입을 알려줌
        } else if ("금성".equals(planets)) {
            distance = 42000000L;
        } else if ("화성".equals(planets)) {
            distance = 78000000L;
        } else if ("목성".equals(planets)) {
            distance = 628000000L;
        } else if ("토성".equals(planets)) {
            distance = 1280000000L;
        } else if ("천왕성".equals(planets)) {
            distance = 2720000000L;
        } else if ("해왕성".equals(planets)) {
            distance = 4350000000L;
        } else {
            System.out.println("조건에 맞는 행성을 선택해주세요.");
        }
    }

    void printPlanets() {
        System.out.printf(planets +"과 지구 사이의 거리: %,dkm\n",distance );
        System.out.printf("지구에서 %s까지 걸리는 시간%n", planets);
        printMoveTime("빛", 1080000000L);// 빛의 속도를 연산 편리화를 위해, m/s가 아닌 km/h로 변환하여 사용
        printMoveTime("우주선", 72000L);// 비행기의 속도또한 연산편리화를 위해 m/s->km/h
        printMoveTime("비행기", 700L); //비행기와 걷기는 이미 기본이 km/h이기에 그대로 놔둠
        printMoveTime("걷기", 4L);
    }

    void printMoveTime(String moveName, double moveSpeed) {
        double totalHours = (double) distance / moveSpeed; //시간 = 거리/속도;

        long years = (long) (totalHours / 8766); // 365.25 * 24
        double remainingHours = totalHours % 8766; // 식 간단화를 위해 총시간과 년(8766)을 나눈 나머지 값을 저장.

        int months = (int) (remainingHours / 730.5); // 평균 한 달 = 730.5시간
        remainingHours = remainingHours % 730.5; //총시간과 달(730.5)을 나눈 나머지 값을 저장

        int days = (int) (remainingHours / 24);
        remainingHours = remainingHours % 24; //총시간과 시간을 나눈 나머지 값을 저장

        int hours = (int) remainingHours;
        double remainingMinutes = (remainingHours - hours) * 60; //소수점을 받기위해 double로 선언된 remainingMinutes를 선언하여 저장

        int minutes = (int) remainingMinutes;
        double seconds = (remainingMinutes - minutes) * 60;

        System.out.printf("%s(으)로 가는데 걸리는 시간(속도: %,d km/h) : %d년 %d개월 %d일 %d시간 %d분 %.1f초%n",
                moveName,(long)moveSpeed,years, months, days, hours, minutes, seconds);
    }
}
