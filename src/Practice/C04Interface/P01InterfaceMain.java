package Practice.C04Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P01InterfaceMain {
    public static void main(String[] args) {
        P01Cat cat = new P01Cat();
        cat.makeSound();
        cat.makeSound2();
        cat.play1("멍멍이", "고양이");

        P01Dog dog = new P01Dog();
        dog.makeSound();
        dog.makeSound2();
        dog.play1("손흥민", "박지성");

        P01AnimalInterface1 cat2 = new P01Cat();
        cat2.makeSound();
        cat2.play1("차두리", "차범근");

        P01AnimalInterface1 dog2 = new P01Dog();
        dog2.makeSound();
        System.out.println(dog2.play1("개", "말"));

////        다형성의 장점 : 하나의 부모타입으로 여러 자식 객체를 다룰 수 있다.
////        인터페이스의 장점 : 개발의 표준을 지정할 수 있다.
//        List<Integer> myList1 = new ArrayList<>();
//        myList1.add(10);
//          위와 아래의 add는 다른 add이다.
//        List<Integer> myList2 = new LinkedList<>();
//        myList2.add(10);

//        다중구현의 예시, LinkedList implements List, Queue
//        -> 인터페이스에 따라 사용할 수 있는 메서드가 제한된다.
//        List에 a(), b() / Queue에 c(), d()가 있다면
//        List에서는 a(), b()메서드 / Queue에서는 C(), d()메서드만 사용 가능
    }
}
