package Practice.C03Inheritance;

public class ProtectedTest {
    public static void main(String[] args) {
        ProtectedClass p1 = new ProtectedClass();
        p1.st1 = "hello python";
//        p1.st2 = "hello python1"; 불가능, private이므로 같은 클래스가 아님
        p1.st3 = "hello python2"; //같은 패키지 내이므로 접근 가능
        // protected이므로 같은 패키지 내 접근가능
        // protected이므로 상속 했을 때 패키지가 달라도 접근 가능
        p1.st4 = "hello python4";

    }
}
