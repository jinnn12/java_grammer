package C05AnonymousLamda;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class C04StreamApi {
    public static void main(String[] args) {
        int[] arr = {20, 10, 4, 12};
////        전통적인 방식의 데이터 접근 방법 : 메모리의 주소 접근
//        for (int i = 0; i < arr.length; i++) { //직접 메모리에 접근
//            System.out.println(arr[i]);
//        }
//
////        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌 입력에따른 출력만 존재
////        streamApi : java에서 함수형프로그래밍을 지원하는 라이브러리
////        foreach는 스트림의 각 요소를 하나씩 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach((a -> System.out.println(a)));
//
////        스트림의 생성 : .stream()
//        List<String> myList = new ArrayList<>();
//        myList.add("HTML");
//        myList.add("CSS");
//        myList.add("javascript");
//        Stream<String> stream1 = myList.stream();

//        String[] myArr = new String[3];
//        myArr[0] = "HTML";
//        myArr[1] = "CSS";
//        myArr[2] = "javascript";
//        Stream<String> stream2 = Arrays.stream(myArr);

///        원시자료형을 위한 stream 객체가 별도로 존재 ( <> 제네릭 안에 원시자료형 들어가지 못해서 따로 만들어줌)
//        int[] intArr = {10, 20, 30, 40, 50};
//        IntStream stream3 = Arrays.stream(intArr);

//        LongStream;
//        DoubleStream;

////        Stream의 중개연산(변환) : filter, map, sorted, distinct, mapToInt(결괏값을 Intstream형태로 변환)
//        int[] intArr = {10, 10, 30, 40, 50};
////        30보다 작은 값들의 총합
////        filter : 특정기준으로 대상을 filtering 하여 스트림 변환하는 중개연산 메서드
////        sum : 스트림의 요소를 하나씩 소모하여 총합을 구하는 메서드 (소모메서드, 사용하고 나면 사용할 수 없다)
//        int total = Arrays.stream(intArr).filter(a -> a <= 30).sum(); //30보다 작은애들로 걸러진 애들로 .sum()
//        System.out.println(total);
//
////        map : 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int[] intArr2 = {10, 10, 30, 40, 50};
//        int total2 = Arrays.stream(intArr2).map(a -> a * 10).sum();
//        int[] newIntArr = Arrays.stream(intArr2).map(a -> a * 10).toArray(); // 새로운 배열을 만들어줌
//        System.out.println(Arrays.toString(newIntArr));
//
////        distinct : 중복 제거
//        int[] intArr3 = {10, 10, 30, 40, 50};
//        int total3 = Arrays.stream(intArr3).distinct().sum();
//        System.out.println(total3);
//
////        sorted : 정렬
//        int[] intArr4 = {80, 10, 30, 50, 20};
//        int[] newArr4 = Arrays.stream(intArr4).sorted().toArray(); //원시자료형이라 Comparator 사용 불가능

//        String[] stArr2 = {"K", "D", "A", "C"};
//        Arrays.stream(stArr2).sorted(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });
//        Arrays.stream(stArr2).sorted ((o1, o2) -> o1.getAge() - o2.getAge());
//        System.out.println(Arrays.toString(newArr4));
//
////        mapToInt : IntStream 형태로 변환해주는 map
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
////        모든 문자열 길이의 총합
////        int lengthTotal = Arrays.stream(stArr).map().sum(); //String 타입이라 sum이 안되지 않겠음?
//        int lengthTotal = Arrays.stream(stArr).mapToInt(a-> a.length()).sum(); //여기서 a가 머임? 하나의 약속이다, a로 가져오겠다
//        System.out.println(lengthTotal);

//        int[] arr1 = {1, 2, 3, 4, 5, 6};
////        arr에서 홀수만 담은 배열 생성 후 출력
//        Arrays.stream(arr1).filter(a -> a % 2 != 0).toArray();
//        System.out.println(Arrays.toString(arr1));
//
////        arr에서 홀수만 걸러서 해당 홀수의 제곱값을 담은 배열을 생성 후 출력
//        int[] newArr2 = Arrays.stream(arr1).filter(a -> a % 2 != 0).map(a->a*a).toArray();
//        System.out.println(Arrays.toString(newArr2));
//
////        arr에서 홀수만 거르고, 제곱값을 구하고, 해당 숫자값을 오름차순한 순서로 배열을 생성 후 출력
//        int[] newArr3 = Arrays.stream(arr1).filter(a -> a % 2 != 0).map(a -> a * a).sorted().toArray();
//        System.out.println(Arrays.toString(newArr3));

////        스트림의 소모 : foreach(출력), sum(합계), max, min, count, reduce(누적연산), findFirst(스트림의 첫번째값 리턴)
////        sum, max, min, count, findFirst
//        int[] intArr = {10, 20, 30, 40};
//        Arrays.stream(intArr).forEach(a-> System.out.println(a)); //다른 영역에서 선언되어있는 변숫값을 끌어다가 쓸 수 없다. 스트림은 독립적인 공간!
//        int total = Arrays.stream(intArr).sum(); // intArr이 비어있어도 0을 출력하면 되므로 괜찮음
////        optional 객체 : 값이 있을 수도 있고, 없을 수도 있음을 명시한 객체
////        int max1 = Arrays.stream(intArr).max(); // OptionalInt, 야! intArr 비어있으면 어떡할래?
//        int max = Arrays.stream(intArr).max().getAsInt();
//        int min = Arrays.stream(intArr).min().getAsInt();
//        int count = (int)Arrays.stream(intArr).count();
//        long count2 = Arrays.stream(intArr).count();
//
////        reduce : 누적연산 -> reduce(초기값, 연산식), 매개변수 2개 (a(a에다 값을누적해서), b(를더하겠다)
//        int acc = Arrays.stream(intArr).reduce(0, (a,b) -> a+b);
//        System.out.println(acc);
//        int accMultiply = Arrays.stream(intArr).reduce(1, (a,b) -> a*b);
//        System.out.println(accMultiply);
//
//        String[] stArr = {"hello", "java", "world"};
////        hellojavaworld 로 문자열을 합해라
//        String accSum = Arrays.stream(stArr).reduce("", (a, b) -> a + b);
//        System.out.println(accSum);
//
////        findFirst : 첫번째 요소 반환
//        String firstSt = Arrays.stream(stArr).filter(a->a.length()>=5).findFirst().get(); // 없을수도 있으니 검증한번하라고 경고를 줌
//        System.out.println(firstSt);

////        주의사항 : 제네릭의 타입소거 (효율성을 위해 런타임 시점에 제네릭이 소거됨)
////        자바의 런타임 시점에 <String>과 같은 제네릭의 타입소거 발생.
////        제네릭의 타입소거로 인해, toArray를 통해 바로 새로운 String 배열을 만드는 것은 불가.
////        Intstream은 Stream<Int>가 아니라 IntStream 이므로 제네릭 타입소거 문제가 발생하지 않는다.
//        String[] stArr = {"hello", "java", "world"};
////        String[] answer1 = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray();
//        String[] answer = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray(a -> new String[a]); // 여기서 a는 배열선언을 위한 사이즈
//
////        메서드 참조 : 하나의 메서드만을 호출하는 경우 매개변수를 제거한 형식. "매개변수 제거"가 목적 클래스명::메서드명
////        엄연히 Stream / StreamApi 는 차이가 있다.
//        Arrays.stream(stArr).forEach( System.out::println); //sout에서 out은 System의 static이너클래스인가???
//        String[] answer2 = Arrays.stream(stArr).filter(a->a.length()>=5).toArray(a->new String[a]); // new는 생성자를 호출하는 연산자
//        String[] answer3 = Arrays.stream(stArr).filter(a->a.length()>=5).toArray(String[]::new); //왼쪽에는 클래스명 / 오른쪽에는 메서드명
//
////        StreamApi 실습
////        List에 Student 객체 4개 담기 : {"kim", 20}, {"choi", 32}, {"lee", 35}, {"park", 22}
//        List<Student2> student2List = new ArrayList<>();
//        student2List.add(new Student2("kim", 20));
//        student2List.add(new Student2("choi", 32));
//        student2List.add(new Student2("lee", 35));
//        student2List.add(new Student2("park", 22));
//
////        1) 모든 객체의 평균 나이 (.avg)
//        double avg = student2List.stream().mapToInt(a-> a.getAge()).average().getAsDouble(); //평균은 값이 무조건 있어야 하기 때문에 getAs, 없을수도 있으면 안됨
////        double avg2 = student2List.stream().mapToDouble(a-> a.getAge()).average().getAsDouble();
//        System.out.println(avg);
//
////        2) 정렬을 통한 가장 나이 어린 사람 찾기
////        int min = student2List.stream().mapToInt(a -> a.getAge()).min().getAsInt(); // 나이는 뽑을 수 있으나, 사람 찾기는 어렵다
//        // 오름차순 후 findFirst 하면 됨
//        Student2 s1 = student2List.stream().sorted(((o1, o2) -> o1.getAge() - o2.getAge())).findFirst().get();
//
//        System.out.println(s1);
//
////        3) 30대인 사람들의 이름만 모아서 새로운 String배열에 담기
//        //map을 통해 Student2 타입에서 String 타입으로 변환
//        String[] arr2 = student2List.stream().filter(a -> a.getAge() >= 30).map(a -> a.getName()).toArray(String[]::new);
//        System.out.println(Arrays.toString(arr2));

///        Optional 객체 : 특정 객체에 "값이 없을 지도 모른다"는 것을 명시적으로 표현
///        장점 : 한 번 검증을 하게 끔 만들어줌
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        if(input != null && input.length() > 10) {} // 명시적으로 null이 없다고 해줘야... , 왼쪽부터 연산이므로 왼쪽에 써주는것도 중요

//        String st1 = null;
//        if (st1 != null) { // null이 아니라고 명시적으로 표시
//            System.out.println(st1.compareTo("hello"));
//        } else {
//            System.out.println("값이 없습니다.");
//        }
//
//        Optional<String> opt1 = Optional.ofNullable(null); // 값이 있는지 없는지 한 번 검증하는 과정?
//        if (opt1.isPresent()) {
//            System.out.println(opt1.get().compareTo("hello"));
//        } else {
//            System.out.println("값이 없습니다.");
//        }

////        Optional 객체 생성 방법 3가지
//        Optional<String> opt1 = Optional.empty(); // 비어있는 Optional 객체 생성할 때 사용하는 방법 (.empty() -> 비어있는걸 만듦)
//        Optional<String> opt2_1 = Optional.ofNullable(null); // 비어있는 Optional 객체 생성 (있을 수도 있고 없을 수도 있는 것, null)
//        Optional<String> opt2_2 = Optional.ofNullable("hello"); // 값이 있는 Optional 객체 생성 (있을 수도 있고 없을 수도 있는 것, 값 hello)
//        Optional<String> opt3 = Optional.of("hello"); // 값이 있는 Optional 객체 생성

////        Optional 객체 처리 방법 4가지 (방법1, 방법4 정도만 알아두자)
////        방법1. isPresent()로 확인 후에 get()
//        if (opt2_1.isPresent()) {
//            System.out.println(opt2_1.get());
//        } else {
////            System.out.println(opt2_1.get()); // No value present 에러 발생
//            System.out.println("값이 없읍니다");
//        }
//
////        방법2. orElse() : 값이 있으면 있는 값 return, 없으면 지정한 값 return
//        System.out.println(opt2_1.orElse("값이 없습니다.")); //값이 있으면 꺼내고 없으면 other 리턴
//        System.out.println(opt2_2.orElse("값이 없습니다.")); //값이 있으면 꺼내고 (여기선 hello 리턴) 없으면 other 리턴
//
////        방법3. orElseGet() : 값이 있으면 있는 값 return, 없으면 람다함수 실행
//        System.out.println(opt2_1.orElseGet(() -> new String("값이 없습니다."))); // 새로운 String을 만드는 것, 값이 없으면 람다실행

////        방법4. (가장 많이 사용) orElseThrow : 값이 있으면 있는 값 return, 없으면 지정된 예외 강제 발생. (일부러 에러 발생 시키기?)
////        개발에서 사용자에게 적절한 메세지 전달 목적과 의도된 코드 중단을 목표로 강제로 예외 발생시키는 경우는 매우 많음
//        // System.out.println(opt2_1.orElseThrow(()->new RuntimeException("예외 : 값이 없습니다"))); // 에러 발생 -> 의도한 에러
//        System.out.println(opt2_1.get()); //에러 발생 -> 의도치않은 에러

//        Optional 객체 예시1
        List<Student2> studentList3 = new ArrayList<>();

///        평균 구하기 방법 1
//        OptionalDouble age = studentList.stream().mapToInt(a->a.getAge()).average(); // getAsDouble을 사용을 안하면되는걸 이제 알게됐지?
//        if (age.isPresent()) {
//            System.out.println(age.getAsDouble());
//        } else {
//            throw new NoSuchElementException("값이 없습니당"); // 내가 의도한 에러 직접 발생
//        }

////        평균 구하기 방법 2
//        OptionalDouble age2 = studentList.stream().mapToInt(a -> a.getAge()).average();
//        age2.orElseThrow(()->new NoSuchElementException("값이 진짜 없습니다"));
//        //한줄로바꿔봐


////        Optional 객체 예시2 (List를 DB로 생각하기, CRUD -> R (회원목록조회, 회원상세조회))
//        studentList3.add(new Student2("kim", 20));
//        studentList3.add(new Student2("choi", 32));
//        studentList3.add(new Student2("lee", 35));
//        studentList3.add(new Student2("park", 22));
//        System.out.println("조회하고자 하는 student의 index 번호를 입력해주세요.");
//        Scanner sc = new Scanner(System.in);
//        int indexNumber = Integer.parseInt(sc.nextLine());
////        System.out.println(studentList3.get(indexNumber)); // index는 0~3까지만 있음, 4, 5 .. 입력하면 IndexOutOfBoundsException 발생
//
////        index 범위가 list 안에 있으면 Optional.ofNullable 또는 of, ofEmpty
//        Optional<Student2> optStudent;
//        if (studentList3.size() <= indexNumber) {
//            optStudent = Optional.empty(); // .empty() 없는 값을 할당한다
//        } else {
//            optStudent = Optional.of(studentList3.get(indexNumber));
//        }
//        System.out.println(studentList3); // 회원목록조회 (Optional로 만들 이유가 없음, 빈 경우 new ArrayList<>()로 초기화 돼있기 때문에 그냥 빈값 return하면 되기 때문)
//        System.out.println(optStudent.orElseThrow(() -> new NoSuchElementException("입력하신 index는 없는 index번호입니다."))); // 상세조회 (빈값이 조회되면 안되기때문에 Optional로 만들어야 함)

//        if (studentList3.size() <= indexNumber) {
//            optStudent = Optional.ofNullable(null);
//        } else {
//            optStudent = Optional.ofNullable(studentList3.get(indexNumber));
//        }

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
        return "student{" + "name='" + name + ", age=" + age + '}';
    }
}
