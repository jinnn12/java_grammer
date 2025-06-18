package Practice;

public class C05Scope {
    public static int v2 = 10; //어디서든 접근 가능
    public static void main(String[] args) {
//        지역변수의 유효범위
        int v1 = 10; //메인메서드 내부의 지역변수
        scope(v1); // scope 메서드 호출함으로써 v2가 30으로 바뀜
        System.out.println(v1); //이건 main 내 지역변수 v1 =10 출력
        System.out.println(v2); // 클래스 변수니까 scope 메서드에서 바뀐 값 사용

//        객체의 유효범위
        Person p1 = new Person();
        p1.setName("KIM");
        p1.setEmail("kim@naver.com");
        p1.setAge(20);
        scope2(p1);




    }




    public static void scope(int v1) { // main의 v1값 복사해서 전달받음
        v1 = 20; // scope지역의 지역변수 v1을 20으로 바꿈
        v2 = 30; // 클래스변수 v2 30으로 바꿈 -> main에서도 적용됨
        System.out.println(v1); //scope 안에서는 20이므로 20출력
    }

    public static void scope2(Person p1) {
        p1.setAge(30);
        System.out.println(p1.printPerson());
    }

}

//public static void scope (int v1) {
//    v1=20;
//
//
//}
