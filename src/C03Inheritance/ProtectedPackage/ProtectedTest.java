package C03Inheritance.ProtectedPackage;

// 같은 패키지 내의 클래스가 아닌 경우 import 필요
// 패키지 바로 하위의 모든 클래스는 *로 import 가능, 다만 패키지 내의 패키지 안의 클래스는 *로 import 불가능
import C03Inheritance.*;

public class ProtectedTest extends C04ProtectedClass {

    public static void main(String[] args) {

        ProtectedTest p1 = new ProtectedTest();
//        public 접근제어자는 프로젝트 전역에서 접근 가능
        p1.st1 = "hello python";
//        패키지가 달라졌으므로 default 변수 접근 불가
//        p1.st3 = "hello python"; // 패키지가 달라졌으므로 default 제어자는 접근 불가

//        상속관계가 있을 경우, 패키지가 달라도 protected변수에 접근 가능
        p1.st4 = "hello python";

        C04ProtectedClass c1 = new C04ProtectedClass();
//        c1은 부모클래스의 객체일 뿐, 상속관계가 있는 객체가 아니므로 protected 변수(st4) 접근 불가능
//        c1.st4 = "hello pyhh";

    }
}
