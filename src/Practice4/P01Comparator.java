package Practice4;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P01Comparator {
    public static void main(String[] args) {
        List<Student2> studentList = new ArrayList<>();
        studentList.add(new Student2("kim", 24));
        studentList.add(new Student2("lee", 14));
        studentList.add(new Student2("park", 34));
        studentList.add(new Student2("cha", 27));
        studentList.add(new Student2("son", 29));

//        studentList.sort(new Comparator<Student2>() {
//            @Override
//            public int compare(Student2 o1, Student2 o2) {
//                return 0;
//            }
//        });

        studentList.sort((s1, s2) -> {
            int i = s1.getAge() - s2.getAge();
            return i;
        }) ;

    }
}

class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
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
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
