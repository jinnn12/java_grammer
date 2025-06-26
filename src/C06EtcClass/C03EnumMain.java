package C06EtcClass;

public class C03EnumMain {

    public static void main(String[] args) {
////        classGrade를 일반문자열로 세팅할 경우 (중구난방으로 입력이 되어 문제가 생긴다, 분류가 안됨)
//        Student s1 = new Student("hong", "1학년");
//        Student s2 = new Student("hong2", "FirstGrade");
//        Student s3 = new Student("hong3", "FIRST_GRADE");

////        static final을 통해 변수값 관리하는 방법
////        -> 타입이 String이므로 얼마든지 자유롭게 세팅이 가능한 문제점 존재 ~> "타입을 바꾸어야겠다"
//        Student s1 = new Student("hong", ClassGrade.c1);
//        Student s2 = new Student("hong2", "FirstGrade");
//        Student s3 = new Student("hong3", ClassGrade.c2);

//        Enum 클래스를 활용한 ClassGrade 세팅
        Student s1 = new Student("hong", ClassGrade.FIRST_GRADE);
//        Student s2 = new Student("hong2", "FIRST_GRADE"); //타입불일치 에러 발생
        Student s3 = new Student("hong3", ClassGrade.THIRD_GRADE);
        System.out.println(s1);

//        Enum 클래스의 내부에는 값이 저장된 순서대로 0부터 index값이 내부적으로 할당 (0, 1, 2 index 할당 ...)
        System.out.println(s1.getClassGrade().ordinal());



    }
}
class Student {
    private String name;
    private ClassGrade classGrade; // 지맘대로 설정할 수 있어서 문제가 생김

    public Student(String name, ClassGrade classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }

    public String getName() {
        return name;
    }

    public ClassGrade getClassGrade() {
        return classGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classGrade=" + classGrade +
                '}';


    }
}
//class ClassGrade {
//    static final String c1 = "FIRST_GRADE";
//    static final String c2 = "SECOND_GRADE";
//    static final String c3 = "THIRD_GRADE";
//}

enum ClassGrade { // ClassGrade를 표현하기 위한 클래스 내의 변수, 문자열이 아님.
    FIRST_GRADE, SECOND_GRADE, THIRD_GRADE
}
