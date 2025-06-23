package Practice.C03Inheritance;
import java.util.*;
// Final 키워드가 붙은 class는 상속 불가, final 키워드가 붙은 메서드는 Overriding 불가


public class AbstractMain {
    public static void main(String[] args) {
        //기본적으로 선언이 불가능
        //추상클래스는 구현체가 없는 메서드가 있으므로...
//        Animal a1 = new Animal();

//        Dog2의 객체 ad1은 Animal의 makeSound1과
//        abstract void makeSound2를 갖고 있다.

        Dog2 ad1 = new Dog2();
        ad1.makeSound1();
        ad1.makeSound2();

//        Dog2가 구현체이고, Dog2안에서 makeSound2가 오버라이딩 되었으므로
//        Animal 타입으로 객체를 만들어도 makeSound2가 구현이 가능하다.
        Animal ad2 = new Dog2();
        ad2.makeSound2();
    }
}

abstract class Animal {
    void makeSound1() {
        System.out.println("동물은 소리를 냅니다.");
    }
    abstract void makeSound2();
}

class Dog2 extends Animal {
    @Override
    void makeSound2() {
        System.out.println("멍멍");
    }
}

final class FinalParents {

}
