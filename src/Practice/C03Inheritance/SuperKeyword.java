package Practice.C03Inheritance;
// 상속받을 때 부모클래스의 기본생성자가 없으면 자식클래스에서 상속 시 기본적으로 에러 발생.
// 부모의 생성자를 직접 만들 때 기본생성자를 안 만든다면 super()를 사용한다.

public class SuperKeyword extends SuperParents{
    int a;
//    생성자
    SuperKeyword () {
        super(20);
        this.a = 10;
    }

    public static void main(String[] args) {
        SuperKeyword c2 = new SuperKeyword();
        c2.display();
    }

    public void display() {
        System.out.println("자식의 변수 : " + a);
        // super()는 부모를 지칭하는 것
        // SuperKeyword 클래스에서 super(20)을 먼저 선언한 뒤,
        // SuperKeyword클래스의 메서드 display에서 super.a < 부모의 a를 sout
        System.out.println("부모의 변수 : " + super.a);
    }
}

class SuperParents {
    int a;
    public SuperParents (int a) {
        this.a = a;
    }
    public SuperParents (){ //상속 에러 방지를 위한 기본 생성자
    }

}
