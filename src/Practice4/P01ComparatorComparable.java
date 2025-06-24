package Practice4;
import java.util.*;

public class P01ComparatorComparable {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개가 제공된다.
//        Comparable 인터페이스 : compareTo 선언
//        Comparator 인터페이스 : compare 메서드 선언 -> 원시자료형 사용 불가능

        String a = "hello";
        String b = "world";
//        String은 implements Comparable
//        따라서 compareTo 사용 가능 / 밑은 음수(-15) 출력
        System.out.println(a.compareTo(b));

//        <String> 이므로
//        String 안의 Comparable compareTo 메서드를 사용하여 정렬이 이뤄짐
        List<String> myList = new ArrayList<>();
        myList.add("good");
        myList.add("happy");
        myList.add("java club");
        Collections.sort(myList);

//        Student 타입의 studentList를 만들어보자.
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kim", 24));
        studentList.add(new Student("lee", 14));
        studentList.add(new Student("park", 34));
        studentList.add(new Student("cha", 27));
        studentList.add(new Student("son", 29));

//        정렬방법 1. Student 객체에서 Comparable을 직접 구현
//        Student 클래스에서 직접 객체를 수정해야하므로 유연성이 떨어짐.
        Collections.sort(studentList);


    }
}


class Student implements Comparable<Student> {
    private String name;
    private int age;

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}