package Practice4;

import java.util.*;
public class P01Comparable {
    public static void main(String[] args) {
        List<Student1> studentList = new ArrayList<>();
        studentList.add(new Student1("Kim", 24));
        studentList.add(new Student1("Lee", 27));
        studentList.add(new Student1("Park", 34));
        studentList.add(new Student1("Cha", 65));
        studentList.add(new Student1("Son", 37));

//        compareTo { return }에 따라 정렬이 달라진다.
        Collections.sort(studentList);
        System.out.println(studentList);
    }
}
class Student1 implements Comparable <Student1>{
    private String name;
    private int age;

    public Student1(String name, int age) {
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
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
//        이름 기준 정렬
//        return this.getName().compareTo(o.getName());
//        return o.getName().compareTo(this.getName());

//        나이 기준 정렬
        return this.getAge() - o.getAge();
//        return o.getAge() - this.getAge();
    }
}
