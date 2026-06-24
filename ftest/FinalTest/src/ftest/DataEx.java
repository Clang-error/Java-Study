package ftest;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// 자신의 생일을 final로 보관하고 출력하라. 오늘은 2026년 6월 16일이다.
// 오늘까지 며칠을 살았는지 확인해 보자. 또, 우리는 특정일을 기념하기 위해서 날짜를 헤아린다.
// 오늘부터 1,000일 후는 며칠인가? 를 확인하는 프로그램을 작성하라
public class DataEx {
    public static void main(String[] args) {
        final int birthYear = 2004;
        final int birthMonth = 4;
        final int birthDay = 20;

        final LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);
        final LocalDate today = LocalDate.of(2026, 6, 16);

        long livedDays = ChronoUnit.DAYS.between(birthday, today);
        LocalDate after1000Days = today.plusDays(1000);

        System.out.println("나의 생일은 " + birthYear + "년  "+birthMonth+"월 "+birthDay+"일 입니다.");
        System.out.println("오늘까지 " + livedDays + "일을 살았습니다.");
        System.out.println("오늘부터 1,000일 뒤는 " + after1000Days+"입니다.");
    }
}
