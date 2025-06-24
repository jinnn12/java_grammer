package Practice4;

import java.lang.reflect.Member;

public class P01InnerClass {
    public static void main(String[] args) {
        MemberInnerClass m1 = new MemberInnerClass();
        System.out.println(m1.getA());

        MemberInnerClass.StaticInnerClass m2 = new MemberInnerClass.StaticInnerClass();
        m2.display();
    }
}

class MemberInnerClass {
    int a;

    MemberInnerClass() {
        this.a = 10;
    }
    int getA () {
        return this.a;
    }
//    static 내부클래스 : MemberInnerClass의 static 변수처럼 활용된다.
    static class StaticInnerClass {
        int b = 20;
        void display() {
            System.out.println(this.b);
        }
}
}
