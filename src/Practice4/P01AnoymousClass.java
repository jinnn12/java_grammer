package Practice4;

public class P01AnoymousClass {
    public static void main(String[] args) {
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound() {
                System.out.println("개짖는소리");
            }
        };
        a1.makeSound();
        a1.makeSound2();
//        구현체가 없는 추상클래스, 인터페이스는 익명클래스를 통해 익명객체로 생성 가능하다.
        Animal1 a2 = new Animal1() {
            @Override
            public void makeSound() {}
            @Override
            public void makeSound2() {}
        };
//       인터페이스의 익명객체에 구현메서드가 1개일 경우 람다표현식 가능
//       메서드의 매개변수() / 중괄호 {}만 남음
        Animal2 a3 = () -> { // {}는 구현체
            System.out.println("비트주세요");
            System.out.println("멍멍!");
        };
        a3.makeSound();

//        실행문이 한 줄일 경우 중괄호 제거 가능
        Animal2 a4 = () -> System.out.println("노래한곡하겠습니다.");

//        매개변수가 있는 익명객체의 람다함수 생성
        Animal3 a5 = (A,B,C) -> {return A + ", " + B + ", " + C;};
        Animal3 a6 = (q,w,e) -> q + ", " + w + ", " + e;
        System.out.println(a5.makeSound1("put","your","hands up!"));
        System.out.println(a6.makeSound1("yeah", "let's", "gogo"));

//        실습
//        Animal4의 인터페이스 정의, makeSound 메서드 선언
//        매개변수 String, String, int / 리턴타입 String
//        int 숫자값이 10 이상이면 a+b / 10 미만이면 a만 리턴
        Animal4 as = new Animal4() {
            @Override
            public String makeSound1(String a, String b, int c) {
                if (c >= 10) {
                    return a+b;
                } else {
                    return a;
                }
            }
        };
        Animal4 as2 = (a,b,c) -> {
            if (c >= 10) {
                return a+b;
            } else {
                return a;
            }
        };

        System.out.println(as.makeSound1("good", "happy", 5));
        System.out.println(as2.makeSound1("good", "happy",20));
    }
}

abstract class AbstractAnimal {
    abstract void makeSound();

    void makeSound2() {
    }
}

interface Animal1 {
    void makeSound();
    void makeSound2();
}
interface Animal2 {
    void makeSound();
}
interface Animal3 {
    String makeSound1(String a, String b, String c);
}
interface Animal4 {
    String makeSound1(String a, String b, int c);
}
