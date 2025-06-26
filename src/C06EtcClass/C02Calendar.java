package C06EtcClass;

import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.time.*;

public class C02Calendar {
    public static void main(String[] args) {
////        java.util 패키지 내 Calendar 클래스가 있음, DB에 저장할 때 쓰임?
//        Calendar myCalendar = Calendar.getInstance(); // static 메서드, Calendar 안에 new가 있음
//        System.out.println(myCalendar.getTime());
//        System.out.println(myCalendar.get(Calendar.YEAR));
//        System.out.println(myCalendar.get(Calendar.MONTH)+1);
//        System.out.println(myCalendar.get(Calendar.DAY_OF_WEEK)); // 요일
//        System.out.println(myCalendar.get(Calendar.DAY_OF_MONTH)); // 날짜
//        System.out.println(myCalendar.get(Calendar.HOUR_OF_DAY)); // 24시 체계
//        System.out.println(myCalendar.get(Calendar.MINUTE));
//        System.out.println(myCalendar.get(Calendar.SECOND));

//        java.time 패키지 내 LocalDateTime, LocalDate, LocalTime 클래스가 있음 (getter 메서드 내장)
//        훨씬 현대적임, LocalDateTime을 가장 많이 사용한다
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
//        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getHour());
//        get메서드와 ChronoField 매개변수로 다양한 형식의 날짜/시간정보 조회
        System.out.println(localDateTime.get(ChronoField.YEAR)); // chronofield 매개변수로 줄 수 있다.
        System.out.println(localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(localDateTime.get(ChronoField.AMPM_OF_DAY)); // 0 : 오전 , 1 : 오후
        System.out.println(localDateTime.get(ChronoField.CLOCK_HOUR_OF_DAY)); // 24시 체계

//        .of : 임의로 시간정보 객체를 만들어내고 싶을 때 사용
        LocalDate birthDay = LocalDate.of(2000, 11, 12); // 하나의 날 짜 객체를 만드는 것
        System.out.println(birthDay);

        LocalDateTime birthDayTime = LocalDateTime.of(2000, 11, 12, 15, 14, 2);
        System.out.println(birthDayTime);

//        Object클래스엔 메서드가 많이 선언이 안 돼 있어서 효율적이진 못하다
        Object a = new String[3]; // Object는 모든 클래스의 부모 클래스
        Object[] b = new String[3]; // Object는 String을 받음
    }
}
