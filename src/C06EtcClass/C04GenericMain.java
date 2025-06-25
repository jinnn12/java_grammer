package C06EtcClass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//<> : 제네릭 : 클래스, 메서드 일반화하는것 -> List<String, Integer >
public class C04GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C"};
        setChange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {10, 20, 30};
        intChange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));

        allChange(stArr, 0, 1);
        allChange(intArr, 0, 1);

//        일단객체 생성시
        Person p1 = new Person("hong");
        GenericPerson<Integer> p2 = new GenericPerson<Integer>(10);
        GenericPerson<String> p3 = new GenericPerson<>("Kim");

//        제네릭의 사용 예시
        List<String> myList = new ArrayList<>();
        Stream<String> myStream;
        Optional<Student> studentOptional;
    }

    //    제네릭메서드는 반환타입 왼쪽에 <T>라고 선언
//    이때 T에는 참조형 변수인 객체타입만을 혀옹
    static <T> void allChange(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    static void setChange(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void intChange(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// 제네릭 클래스는 클래스명 옆에 <T>선언
class GenericPerson<T>{
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Person{
    private String value;

    public Person(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}