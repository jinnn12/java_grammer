package C05AnonymousLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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

//        주의사항 : 제네릭의 타입소거 (효율성을 위해 런타임 시점에 제네릭이 소거됨)
//        자바의 런타임 시점에 <String>과 같은 제네릭의 타입소거 발생.
//        제네릭의 타입소거로 인해, toArray를 통해 바로 새로운 String 배열을 만드는 것은 불가.
//        Intstream은 Stream<Int>가 아니라 IntStream 이므로 제네릭 타입소거 문제가 발생하지 않는다.
        String[] stArr = {"hello", "java", "world"};
//        String[] answer1 = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray();
        String[] answer = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray(a -> new String[a]); // 여기서 a는 배열선언을 위한 사이즈



    }
}
