package C05AnonymousLamda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개가 제공된다. (정렬?)
//        Comparable 인터페이스 : compareTo 메서드 선언
//        Comparator 인터페이스 : compare 메서드 선언 -> 원시자료형에선 사용불가능

//        String 클래스에 compareTo 메서드 내장
//        String클래스 및 java의 많은 클래스에서 Comparable을 구현(상속)하여 compareTo메서드 구현
//        String a = "hello";
//        String b = "world";
//        System.out.println(a.compareTo(b)); // 마이너스, compareTo -> 인스턴스메서드 / Comparable 인터페이스 -> compareTo 메서드가 있음 / String은 implements Comparable

        List<String> myList = new ArrayList<>();
        myList.add("java");
        myList.add("python");
        myList.add("javascript");
//        String안의 compareTo메서드를 사용하여 정렬이 이뤄짐
        Collections.sort(myList); //Comparable

//        직접 만든 Student를 List에 담아 정렬 (어떤 특성을 기준으로 정렬을 할 것인가)
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("kim", 24));
        studentList.add(new Student("lee", 14));
        studentList.add(new Student("park", 34));
        studentList.add(new Student("cha", 27));
        studentList.add(new Student("son", 29));

//        정렬방법 1. Student 객체에서 Comparable을 직접 구현한 방식
//        단점 : Student 객체를 직접 수정해야하므로 유연성이 떨어진다. (코드를 직접 바꾸게 되면 유연성이 떨어짐)
//        Collections.sort에서 Comparable을 구현한 객체를 요구하기 때문에 Comparable을 직접 구현해야 한다.
//        Collections.sort(studentList); // 여기서 Comparable을 요구함
//        System.out.println(studentList);

//        정렬방법 2. Comparator를 구현한 익명객체를 사용.
//        Comparator의 활용도가 높은 이유는 많은 정렬 메서드에서 Comparator 객체를 요구하기 때문
//        또한 Student Class를 직접 건들지 않고 쓸 수 있기 때문?
        studentList.sort(new Comparator<Student>() { // Comparator 인터페이스 자체를 직접 구현, 익명객체이며 메서드가 1개 이므로 람다 가능
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(studentList);

        String[] stArr = {"hello", "java", "C++", "world2"};
        Arrays.sort(stArr);
        Arrays.sort(stArr, Comparator.reverseOrder());
//        글자길이를 기준으로 내림차순 정렬
        Arrays.sort(stArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length(); // o1 시작 -> 오름차순 / o2 시작 -> 내림차순
            }
        });
        System.out.println(Arrays.toString(stArr));

//        백준 - 단어정렬 (1181)

        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o1.length() - o2.length());

//        백준 - 절댓값 힙

//        배열 안의 배열 정렬
//        [4,5], [1,2], [5,0], [3,1]
        List<int[]> myList1 = new ArrayList<>();
        myList1.add(new int[]{4,5});
        myList1.add(new int[]{1,2});
        myList1.add(new int[]{5,0});
        myList1.add(new int[]{3,1});
//        정렬 : 리스트 안의 배열 index 1번째 값을 기준으로 오름차순 / 배열 안의 차를 비교해서 정렬해라
        myList1.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for (int[] m : myList1) {
            System.out.println(Arrays.toString(m));
        }

//        백준 - 선긋기
//        arr[0] 기준으로 정렬
//        3가지의 경우의 수에 따라 total ????





//        Collections.sort(myList); //Comparable
//        myList.sort(Comparator.naturalOrder()); //Comparator
    }
}

//class Student implements Comparable<Student> {

    class Student {
    private String name;
    private int age;

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
        return "student{" +  "name='" + name  + ", age=" + age + '}';
    }

//    정렬은 결국 2개의 값을 비교하는 것으로, A와 B대상 2개만 있으면 충분 (수십만개 데이터가 있어도 this, o 비교)
//    두 수(또는 문자)의 비교의 경우 '음수, 0, 양수' 세 값 중 하나만 return, 이를 통해 정렬 수행
//    this가 앞에 있을 땐 오름차순, this가 뒤에 있으면 내림차순으로 내부적으로 정렬로직이 동작한다.
//    @Override
//    public int compareTo(Student o) {
////
////        return this.getName().compareTo(o.getName()); //오름차순 : 음수
////        return this.getName().compareTo(o.getName()); //내림차순 : 양수
////        return this.getAge() - o.getAge(); // 나이 기준 오름차순
//        return o.getAge() - this.getAge(); // 나이 기준 내림차순
    }

