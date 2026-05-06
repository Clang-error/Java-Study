package Scanner;
import java.util.Scanner;
public class Time {
    int time;
    int Day;
    int hour;
    int minute;
    int second;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        new Time();

    }
    public Time() {
        inputTime();
        TimeConvert();
        printTime();
    }
    void inputTime() {
        System.out.print("정수를 입력하시오:");
        time = sc.nextInt();
    }

    void TimeConvert() {
        Day = time/86400;
        hour = (time%86400)/3600;
        minute = ((time%86400)%3600)/60;
        second = ((time%86400)%3600)%60;
        sc.close();
    }
    void printTime() {
        System.out.printf("입력하신 시간의 일,시,분,초는 : %d일 %d시간 %d분 %d초 입니다.",Day,hour,minute,second);
    }
}
