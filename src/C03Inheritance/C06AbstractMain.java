package C03Inheritance;

import java.util.List;
//Final 키워드가 붙은 class는 상속 불가, final 키워드가 붙은 메서드는 Overriding 불가
//public class C06AbstractMain extends FinalParents{
public class C06AbstractMain extends Parents{

    public static void main(String[] args) {
        AbstractDog d1 = new AbstractDog();
        d1.makeSound1();
        d1.makeSound2();

//        추상클래스는 구현체 없는 메서드가 있으므로, 기본적으로 객체 생성 불가능
//        AbstractAnimal a1 = new AbstractAnimal();

//        객체의 실체가 Dog 클래스를 통해 만들어지므로, 여기서는 d2의 makeSound2 사용이 가능
        AbstractAnimal d2 = new AbstractDog(); // 어차피 실질적인 구현체는 오른쪽이라 왼쪽엔 추상부모클래스 가능하다!
        d2.makeSound1();
        d2.makeSound2();

//        모든 메서드가 abstract인 클래스를 인터페이스라 한다. (= 전부 구현체가 없다)
//        인터페이스는 구현체가 없으므로 기본적으로 별도의 객체 생성 불가 (ArrayList가 아닌 List가 오른쪽에 올 수 없다.)
//        List<Integer> myList = new List<>();




    }
}

// 추상메서드가 하나라도 있는 클래스의 경우 반드시 클래스에도 abstract 키워드를 붙이고, 추상클래스가 됨.
abstract class AbstractAnimal {
    void makeSound1() {
        System.out.println("동물은 소리를 냅니다.");
    }
//    메서드를 선언만 하고, 구현이 없는 메서드 선언 시 abstract 키워드 사용. 자식한테 구현하라고 강제하는 것
    abstract void makeSound2();
}


class AbstractDog extends AbstractAnimal{
    @Override
    void makeSound2() { // 부모의 추상메서드를 재정의 (오버라이드), 강제로 구현해야한다 / 총 메서드 개수 : 2개
        System.out.println("멍멍멍");
    }
}

final class FinalParents {

}
