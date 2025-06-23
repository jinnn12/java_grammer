package C03Inheritance;

// 부모클래스를 상속받을 때 부모클래스의 기본생성자가 없으면 자식클래스에서 상속 시 기본적으로 에러 발생
// 부모클래스의 필드가 초기화가 안되어 있기 때문, 보통 부모클래스에 기본생성자를 추가해준다
// 내가 부모의 생성자를 직접 만들 때 보통 부모클래스에 기본생성자를 추가해준다, 그렇지 않으면 super()를 사용하든...

public class C02SuperKeyword extends SuperParents {
    int a;

    C02SuperKeyword () {
//        super() : 부모클래스의 생성자를 호출하는 메서드
        super(20);
        this.a = 10;
    }
    public static void main(String[] args) {
        C02SuperKeyword c2 = new C02SuperKeyword();
        c2.display();
    }
    public void display() {
        System.out.println("자식의 변수 : " + a);
        System.out.println("부모의 변수 : " + super.a); // super < 부모를 지칭하는 키워드
    }
}

class SuperParents {
    int a;
//    생성자
    public SuperParents (int a) {
        this.a = a;
    }
//    public SuperParents () { // 기본생성자
//    }
}
