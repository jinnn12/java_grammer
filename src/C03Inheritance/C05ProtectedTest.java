package C03Inheritance;

public class C05ProtectedTest {
    public static void main(String[] args) {
        C04ProtectedClass p1 = new C04ProtectedClass();
        p1.st1 = "hello python";
//        p1.st2 = "hello python"; //private는 접근 불가~
        p1.st3 = "hello python";

    }
}
