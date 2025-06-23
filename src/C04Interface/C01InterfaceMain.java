package C04Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01InterfaceMain {
    public static void main(String[] args) {
        C01Cat cat = new C01Cat();
        cat.makeSound();
        C01Dog dog = new C01Dog();
        dog.makeSound();


//        다형성 : 하나의 부모타입으로 여러 자식객체를 다룰 수 있음.
//        C01AnimalInterface1 cat2 = new C01Cat();
//        cat2.makeSound();
//        C01AnimalInterface1 dog2 = new C01Dog();
//        dog2.makeSound();

////        예시
////        인터페이스의 장점 : 개발의 표준을 지정할 수 있음 (메서드 구현을 강제하기 때문)
////        다형성의 장점 (왜 왼쪽에 부모타입 인터페이스를 적는가) : 오른쪽에 있는 기존의 구현체를 다른 구현체로 변경 시 이점
////        ex) List = new ArrayList(기존 구현체) -> List = new LinkedList(다른 구현체)로 바꿔도 됨, List안에서의 메서드만 사용하고 있기 때문
//        List<Integer> myList1 = new ArrayList<>();
//        myList1.add(10); // 이건 ArrayList의 구현, 아랫것과 같은 add가 아님에 주의
//        List<Integer> myList2 = new LinkedList<>();
//        myList2.add(10); // 이건 LinkedList의 구현

//        다중구현(상속)
        C01AnimalInterface1 c1 = new C01Cat();
        C01AnimalInterface2 c2 = new C01Cat();
        c1.makeSound();
        c2.play("고양이", "치타"); // 리턴만 있고, 출력이 없을 경우 console 창에는 뜨지 않는다.

        C01AnimalInterface2 d1 = new C01Dog();
        d1.play("말티푸","시바견");


//        다중구현의 예시, LinkedList implements List, Queue
//        -> 인터페이스에 따라 사용가능 메서드가 제한, List에 a(), b(), Queue에 c(), d()가 있다면
//        List에서는 a(), b()메서드 / Queue에서는 c(), d()메서드만 사용가능 사용 가능
        List<Integer> list = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();



    }
}
