package C02ClassBasic;

import java.util.*;

public class C03Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10, 20));
// 클래스 내부에는 static, non-static이 있다.
// static이 있다면, 클래스.변수, 클래스.메서드
// non-static이라면 클래스 객체 = new 클래스(); 를 선언해서
// 객체.변수(), 객체.메서드()를 사용할 수 있다.

////        A부서의 매출
////        20원 매출 발생
//        System.out.println(MyCalculator.sumAcc(20));
////        30원 매출 발생
//        System.out.println(MyCalculator.sumAcc(30));
////        40원 매출 발생
//        System.out.println(MyCalculator.sumAcc(40));
////        누적합 : 90원
//
////        B부서의 매출
////        10원 매출
//        System.out.println(MyCalculator.sum(10)); //100원 -> 10원이 돼야 함
////        20원 매출
//        System.out.println(20); //120원 -> 30원이 돼야 함
///        프로그램의 범용성이 떨어짐, A회사 / B회사 둘 다 사용 가능해야 함

//        객체를 활용한 매출 계산
//        A부서 매출 : 10원, 20원
        MyCalculatorInstance mi1 = new MyCalculatorInstance(); //mi1은 클래스를 기반으로 만들어진 객체, new를 사용하여 고유의 힙 메모리가 만들어짐.
//        MyCalculatorInstance.sumAcc(); static이 없으므로 sumAcc는 호출이 불가
//        -> 객체로 만들어서 호출해야 함.
        mi1.sumAcc(10); //mi1의 변숫값들이 힙 메모리에 할당이 되니, 우리가 total에 직접 접근을 해서 값을 조회해올수 있다?
        System.out.println(mi1.total); //mi1 total에 접근을 하겠다.
        mi1.sumAcc(20);
        System.out.println(mi1.total);

//        B부서 매출 : 10원, 20원
        MyCalculatorInstance mi2 = new MyCalculatorInstance();
        mi2.sumAcc(10);
        System.out.println(mi2.total);
        mi2.sumAcc(20);
        System.out.println(mi2.total);

        System.out.println(MyCalculatorInstance.total_count); //클래스.를 통해 접근할 수 있는 건 다 static

//        자료구조에서 객체 사용 예시
//        배열
        String[] arr1 = {"heelo", "java", "python"};
        Arrays.sort(arr1); //클래스 메서드 (.sort), 배열은 클래스 메서드로 구성되어 있다 (원시)
        System.out.println(arr1.length); //객체(arr1.length, 인스턴스) 메서드

//        리스트
        List<String> myList = new ArrayList<>();
        Collections.sort(myList); // 클래스 메서드
        myList.sort(Comparator.naturalOrder()); // 현대적인 자료구조일수로 객체 메서드



    }

}

class MyCalculator {
    //    static O : 클래스 변수, static X : 객체 변수
    static int total = 0;
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sumAcc(int a) {
        total += a;
        return total;
    }

}

class MyCalculatorInstance { //객체가 돼서 힙 메모리에 저장, 클래스는 설계도

    int total = 0;
    //    클래스 변수는 모든 인스턴스(객체) 간에 상태 공유 목적으로 사용
    static int total_count = 0;
//    클래스를 만들면, 아래와 같은 클래스 명의 이름을 가진 메서드(생성자)가 기본으로 만들어짐.
//    생성자의 주목적은 객체 생성 시 실행되면서 객체 변수를 초기화하기 위한 목적으로 주로 사용
    public MyCalculatorInstance() {
        total_count++;
    }

//    클래스메서드는 객체의 상태와 상관없는 독립적인 로직 수행 시 가능
    public static int sum(int a, int b) {
        return a + b;
    } //객체 값을 지속적으로 할당하는 것이 아니라 연산만 수행하는 것이기 때문에 static

    public void sumAcc(int total) {
//        this는 객체 그 자신을 의미한다.
//        일반적으로 매개변수, 객체변수 구분 위해 this. 사용한다.
//        (ex) 매개변수명도 total, 객체변수명도 total일 경우 이를 구분하기 위해 (객체의 것)this. 사용
        this.total += total;
    }
}
