package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

//변수의 유효범위
//클래스메서드에서는 왜 객체 메서드를 호출할 수 없을까? 클래스.메서드 / 객체.메서드
//클래스 메서드 : 객체 필요 없이 생성 가능 / 객체 메서드 : 객체 생성이 반드시 필요
//클래스 메서드 에서 객체 메서드 호출 가능? X, 객체 없이 만든 메서드에서 객체를 기반으로 만든 메서드를 호출? 말도 안돼
//객체 메서드에서 객체 메서드 호출 가능? O
//객체 메서드에서 클래스 메서드 호출 가능?
//원시자료형 : 스택 (객체의 경우 힙의 주소값) / 참조자료형(객체) : 힙
public class C05Scope {
    public static int v2 = 10;
    public static void main(String[] args) {
//        지역변수의 유효범위
            int v1 = 10;
            scope(v1);
            System.out.println(v1); //10

//        객체의 유효범위
            C04Person p1 = new C04Person();
            p1.setName("kim");
            p1.setEmail("kim@naver.com");
            p1.setAge(20);
            scope2(p1);
            System.out.println(p1.printPerson());

            List<C04Person> myList = new ArrayList<>();
            myList.add(p1); //메모리 주소를 add
            myList.get(0).setAge(40);
            System.out.println(p1.printPerson());

//        클래스변수의 유효범위
            System.out.println("확인용  " + v2);
            int total = 0;
            for (int i = 0; i < 100; i++) {
                total += i;
            }
        }

        public static void scope ( int v1){ //call by value
            v1 = 20;
            v2 = 30;
            System.out.println(v1); //20
        }

        public static void scope2 (C04Person p1){ //힙메모리 주소, call by reference
            p1.setAge(30);
            System.out.println(p1.printPerson());
        }
    }






////        지역변수의 유효 범위
//        int v1 = 10; // 스택메모리에 저장, 값 자체를 저장
//        scope(v1);
//        System.out.println(v1);
//
////        객체의 유효 범위
//        C04Person p1 = new C04Person();
//        p1.setName("kim");
//        p1.setEmail("kim@naver.com");
//        p1.setAge(29);
//        scope2(p1);
//        List<C04Person> myList = new ArrayList<>();
//        myList.add(p1);
//        myList.get(0).setAge(10);
//        System.out.println(p1.printPerson());
//
////        클래스 변수의 유효 범위
//    } //
//    //static을 붙이면 객체를 안 만들어도(C05Scope scope = new C05Scope();) 사용할 수 있다.
//    public static void scope(int v1) { //call by value
//        v1 = 20; //
//        System.out.println(v1);
//    }
////    힙메모리저장 call buy
//    public static void scope2(C04Person p1) { //힙메모리 주소, call by reference
//        p1.setAge(30);
//        System.out.println();



