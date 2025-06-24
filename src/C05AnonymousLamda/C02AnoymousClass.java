package C05AnonymousLamda;

// 익명 내부 클래스
public class C02AnoymousClass {
    public static void main(String[] args) {
//        AbstractAnimal을 상속한 클래스가 별도로 존재하지 않고,
//        익명클래스가 만들어짐과 동시에 익명객체가 생성되고 있음
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound() {}
        };
        a1.makeSound();
        a1.makeSound2();
//        구현체가 없는 추상클래스, 인터페이스는 익명객체로 생성 가능하다.
        Animal1 a2 = new Animal1() {
            @Override
            public void makeSound1() {}

            @Override
            public void makeSound2() {}
        };

//        인터페이스의 익명객체에 구현메서드가 1개밖에 없을 때는 람다표현식(화살표함수) 사용가능
//        메서드의 매개변수()와 중괄호{}만 남음
//        '아 Animal2 인터페이스에는 메서드가 1개밖에 없구나', '메서드의 구현체는 {} 안에 구현되어있구나'
        Animal2 a3 = () -> { // 인터페이스의 메서드가 여기서 정의된 것
            System.out.println("hello world1");
            System.out.println("hello world2");
        };
        a3.makeSound1();

//       실행문이 한 줄일 때는 중괄호 제거 가능
        Animal2 a4 = () -> System.out.println("hello world1"); //a3와 a4는 완전히 다른 구현이다.

//        매개변수가 있는 익명객체의 람다함수 생성
        Animal3 a5 = (i1,i2,i3) -> {return i1 + ", "+ i2 + ", " + i3;};
        Animal3 a6 = (i1,i2,i3) -> i1 + ", "+ i2 + ", " + i3;
        System.out.println(a6.makeSound1("hello", "python", "c++"));
//        Animal3 a5 = new Animal3() {
//            @Override
//            public String makeSound1(String a, String b, String c) {
//                return "";
//            }
//        }

//        실습
//        Animal4 인터페이스 정의, makeSound메서드 선언(매개변수 String, String, int. 리턴타입 String)
//        익명객체 생성 : 구현체 메서드의 기능 -> int 숫자값이 10 이상이면 a+b를 리턴, int 숫자값이 10 미만이면 a만 리턴
        Animal4 as = new Animal4() {
            @Override
//            public String makeSound(String a, String b, int c) {return null;};
            public String makeSound(String a, String b, int c) {
                if (c >= 10) {
                    return a+b;
                } else {
                    return a;
                }
            }
        };
        Animal4 as2 = (a, b, c) -> {
            if (c >= 10) {
                return a+b;
            } else {
                return a;
            }
        };
        System.out.println(as.makeSound("hello", "java", 20));
        System.out.println(as2.makeSound("hello", "java", 2));
    }
}

abstract class AbstractAnimal { //기본적으로 객체를 만들 수 없다
    abstract void makeSound();

    void makeSound2() {

    }
}

interface Animal1 {
    void makeSound1();

    void makeSound2();

}
interface Animal2 {
    void makeSound1();
}
interface Animal3 {
    String makeSound1(String a, String b, String c);
}
interface Animal4 {
    String makeSound(String a, String b, int c);
}


