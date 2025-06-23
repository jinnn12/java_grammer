package Practice.C03Inheritance;

// 클래스에는 public, default 접근제어자 존재
public class ProtectedClass {
//    변수, 메서드에는 4가지 접근제어자 존재

//    public : 프로젝트 전체에서 접근 가능 (다른 패키지에서도 접근 가능) / 전역
//    private : 현재 클래스 내에서만 접근 가능
//    default : 생략 가능, 같은 패키지 내에서만 접근 가능
//    protected : 상속의 경우 패키지를 벗어나더라도 접근 가능.

    public String st1 = "hello java1";
    private String st2 = "hello java2";
    String st3 = "hello java3";
    protected String st4 = "hello java4";
}
