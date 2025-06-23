package C03Inheritance;

// extends 키워드를 통해 상속을 수행한다. -> 부모의 변수와 메서드를 자식클래스에서 물려받는 것
// 부모클래스의 변수를 접근하기 위해서는 '객체'를 만들어야 한다.
// java에서는 '클래스의 다중 상속'을 지원하지 않음. -> 어떤 클래스의 메서드를 호출하는 것인지에 대한 혼선이 존재한다.

public class C01Inheritance extends Parents{
    public int b = 20;
    public static void main(String[] args) {
        C01Inheritance c1 = new C01Inheritance();
//        자식클래스에서 부모클래스의 a변수 상속
        System.out.println(c1.a); // c1에는 a가 없지만, C0301Inheritance가 상속을 받고 있기 때문에 사용 가능하다
        System.out.println(c1.b); // 이는 자식클래스에서 선언한 객체 변수이다. 부모 클래스에 영향을 주지 못한다.
//        System.out.println(c1.c); c는 private이므로 출력 불가

//        메서드 상속
        c1.m1();
        c1.m2();
    }
//    부모 메서드의 재정의 (메서드 overriding) :
//    부모클래스의 메서드 명과 자식클래스의 메서드 명이 동일할 경우, 자식클래스의 메서드가 우선한다. => 재정의
//    ! 부모클래스의 메서드를 자식클래스에서 재정의

    @Override // Override된 메서드임을 명시적으로 표현하는 표현식. 성능 최적화를 위해서 해당 키워드 붙여주는 것이 더 좋음.
    public void m1() {
        System.out.println("자식클래스 입니다.");
    }

    public void m2() {
        System.out.println("자식클래스의 m2 메서드 입니다.");
    }
}

class Parents {
    public int a = 10;

//  private 접근 제어자는 클래스 내부에서만 접근 가능! -> 아무리 상속관계라 하여도 자식클래스에선 접근(사용) 불가능
    private int c = 20;

    public void m1(){
        System.out.println("부모클래스입니다.");
        System.out.println(c); // 이는 자식클래스가 상속받은 메서드에서 출력이 가능하다.
    }
}
