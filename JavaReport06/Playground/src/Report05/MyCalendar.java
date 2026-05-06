package Report05;
import java.util.Scanner;

public class MyCalendar {
    private int year;
    private int month;
    private int totalDay = 0;
    private final int [] monthDetail = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //윤년이면 2월달(인덱스 1번째)를 29로 변경함
    private int start;

    public static void main(String[] args) {
        MyCalendar cal = new MyCalendar();
        cal.show();
    }

    public void show() {
       intakeYearAndMonth();
       totalDayCalc();
       startDay();
       printMonthDetail();
    }

    void intakeYearAndMonth() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("연도를 입력하세요: ");
        year = sc.nextInt();
        if(year < 1900) {
            System.out.println("1900년 이후의 연도를 입력해주세요.");
            System.exit(0);
        }
        System.out.printf("월을 입력하세요: ");
        month = sc.nextInt();
        if(month < 1 || month > 12) {
            System.out.println("1월부터 12월까지의 월을 입력해주세요.");
            System.exit(0);
        }
    }

    void totalDayCalc() { //계산기준일은 1900년도 1월 1일
        int leapYear = 0;
        for(int i = 1900; i < year; i++) { // 1900년부터 목표년수의 전까지 반복문을 돌림
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) { //난수일때는 leapYear를 증가시킴
                leapYear++;
            }
            totalDay += 365; //반복문을 돌려 총 누적 일에 더함
        }
        totalDay += leapYear; //윤년이였던 달도 포함하기위해 증가시킨 leapYear을 더함

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) monthDetail[1]=29; //목표했던 달을 계산하기 위한 로직 현재 년도가 윤년인지 확인하여 2월달(인덱스번호 1)의 값을 29로 변경
        else monthDetail[1]=28;
        for(int i = 0; i < month-1; i++) { // 누적일수에 목표 월 수 만큼 반복
            totalDay += monthDetail[i];
        }
    }

    void startDay() {
        start = (totalDay+1)%7; //계산기준일이 1900년도 1월 1일인데 이때는 월요일. 월요일부터 시작해야 원하는 결과가나오기에 +1를 더함
    }

    void printMonthDetail() {
        System.out.printf("\t*** %d 년 %d 월 ***\n", year, month);
        char[] days = {'일', '월', '화', '수', '목', '금', '토'};
        for(int i = 0; i < 7; i++) {
            System.out.print(days[i] + "\t"); //줄맞춤을 위해 \t를 (tab) 사용
        }
        System.out.println();
        for(int i = 0; i < start; i++) {
            System.out.print("\t");
        }
        for(int i = 1; i <= monthDetail[month-1]; i++) {
            System.out.print(i + "\t");
            if((i + start) % 7 == 0) System.out.println();
        }
        System.out.println();
    }


}
