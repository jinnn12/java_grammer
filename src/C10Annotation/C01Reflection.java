package C10Annotation;

import java.lang.reflect.Field;

public class C01Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        리플렉션 : 자바에서 런타임시점에 클래스의 변수를 수정할 수 있는 기능
        Person p1 = new Person();
//        아래와 같은 방식을 통해 private 변수인 name 변수에 직접 접근이 가능하다.
        Field nameField = Person.class.getDeclaredField("name");
        nameField.setAccessible(true); // private이라 할 지라도 접근 가능하도록 세팅 변경. -> 자바에서 private이라 할 지라도 내부적으로 지원!
        nameField.set(p1, "bradkim");
        System.out.println(p1);

    }
}
class Person{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}