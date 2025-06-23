package Practice.C03Inheritance;

public class Inheritance extends Parents{
    public int b = 20;
    public static void main(String[] args) {
        Inheritance son = new Inheritance();
        son.m1(); //c는 private이지만 부모클래스에서 c를 출력 메서드를 만들었기에 c가 출력이 가능하다.

    }
    @Override
    public void m1() {
        System.out.println("자식클래스입니다.");
    }
    public void m2() {
        System.out.println("자식클래스의 m2 메서드 입니다.");
    }
}

class Parents {
    public int a = 10;
    private int c = 20;

    public void m1() {
        System.out.println("부모클래스입니다.");
//        private이지만 Parents 클래스 내 변수이기 때문에 메서드에서 선언 가능
//        상속받은 클래스는 이 c를 출력할 수 있다.
        System.out.println(c);

    }
}
