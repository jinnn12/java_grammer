package C02ClassBasic;
import java.util.*;
// 생성자 : 객체가 실행될 때 생성되는 메서드
public class C07Constructor {
    public static void main(String[] args) {
//        p1.name = hong, p1.setName -> 생성자
//        캘린더 객체 생성 : 연도, 월, 일 세팅

//        캘린더 객체 출력 : "오늘은 xxx연도 xx월 xx일 입니다."
//        Calendar.CalendarPrint("2025", "06", "18");
        Calendar c1 = new Calendar("2025", "06", "18");


        //        toString()메서드는 특별한 메서드로 객체명을 출력할 때 자동으로 실행된다.
//        예를들어)
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        System.out.println(myList);
        System.out.println(c1);


    }
    }
class Calendar {
    private String year;
    private String month;
    private String day;

//    생성자를 통해 객체 변숫값들을 객체가 만들어지는 시점에 세팅 (내가 안 만들어도 자동으로 만들어짐)
//    setter를 안 쓰고 직접 생성자 선언 : 안정성 유지를 위해
    public Calendar(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    위처럼 별도 생성자를 추가할 경우, 초기(기본)생성자는 무시되므로
//    초기(기본)생성자 필요시 별도로 추가
    public Calendar() {

    }

    public String getYear() {
        return year;
    }
    public String getMonth() {
        return month;
    }
    public String getDay() {
        return day;
    }


    public void printCalendar() {
        System.out.println("오늘은 " + this.year + "년 입니다.");
    }


}



