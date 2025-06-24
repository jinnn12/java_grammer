package Practice4;

import java.util.*;
import java.util.stream.IntStream;

public class P01StreamApi {
    public static void main(String[] args) {

//        arr1 배열의 데이터 접근 : 메모리의 주소에 접근
        int[] arr1 = {20, 10, 4, 12};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

//        함수형 프로그래밍 방식 : 데이터, 객체 중심이 아닌 입력에 따른 출력만 존재
//        streamApi : java에서 함수형 프로그래밍을 지원하는 '라이브러리'

//        IntStream : 원시자로형 int를 위한 Stream 객체 (제네릭<> 안에 원시자료형이 들어갈 수 없어서)
        int[] intArr = {10, 20, 30, 40, 50};
        IntStream intStream = Arrays.stream(intArr);
        System.out.println(intStream);

//        Stream의 중개연산 : filter, map, sorted, distinct, matToInt
//        1.filter : 특정 기준으로 대상을 filtering 하여 스트림 변환
//        2.sum : 스트림의 요소를 하나씩 소모하여 총합을 구함
        int[] intArr2 = {10, 20, 30, 40};
        int sumIntArr2 = Arrays.stream(intArr2).filter(a -> a <= 30).sum();
        System.out.println(sumIntArr2);

//        3.map : 기존의 스트림을 조작 => 새로운 스트림을 반환
        int[] intArr3 = {10, 20, 30, 30, 40};
        int[] intArr3Double = Arrays.stream(intArr3).map(a -> a * a).toArray();
        System.out.println(Arrays.toString(intArr3Double));

//        4.distinct : 중복제거
        int[] intArr4 = {10, 20, 20, 30, 40};
        int[] newIntArr4 = Arrays.stream(intArr4).distinct().toArray();
        System.out.println(Arrays.toString(newIntArr4));

//        5.sorted : 정렬
        int[] intArr5 = {180, 20, 20, 30, 70, 40};
        int[] newintArr5 = Arrays.stream(intArr5).sorted().distinct().toArray();
        System.out.println(Arrays.toString(newintArr5));

//        6.mapToInt : IntStream 형태로 변환해주는 map
//        map : 기존의 스트림을 조작하여 새로운 스트림을 반환해주는 메서드
        String[] stArr = {"HTML", "CSS", "GoodDay", "JAVA"};
        int total = Arrays.stream(stArr).mapToInt(a->a.length()).sum();

//        실습
        int[] testArr = {1, 2, 3, 4, 5, 6};
//        1. 홀수만 담은 배열 생성 후 출력
        int[] testArr1 = Arrays.stream(testArr).filter(a -> a % 2 != 0).toArray();
        System.out.println(Arrays.toString(testArr1));

//        2. 홀수만 가져온 후, 해당 홀수의 제곱값을 담은 배열을 생성 후 출력
        int[] testArr2 = Arrays.stream(testArr).filter(a -> a % 2 != 0).map(a -> a * a).toArray();
        System.out.println(Arrays.toString(testArr2));

//        3. 홀수만 가져온 후, 제곱값을 구하고, 해당 숫자값을 오름차순한 순서로 배열을 생성 후 출력
        int[] testArr3 = Arrays.stream(testArr).filter(a -> a % 2 != 0).map(a -> a * a).sorted().toArray();
        System.out.println(Arrays.toString(testArr3));

//        스트림의 소모 : foreach, sum, max, min, count, reduce, findFirst
//        1.foreach (출력) : for문을 안 쓰고도 출력 가능!
        int[] eachArr = {10, 20, 30, 40};
        Arrays.stream(eachArr).forEach(a -> System.out.println(a));

//        2. sum : 객체의 합들을 계산
        int[] sumArr = {10, 20, 30, 40};
        int sumArrTotal = Arrays.stream(sumArr).sum();
        System.out.println(sumArrTotal);

//        Optional 객체 : 값이 있을 수도 있고, 없을 수도 있음을 명시
//        3. max
        int[] maxArr = {10, 20, 20, 40, 50, 60};
        // getAsInt()
        // 사실 이렇게 하면 git push origin force랑 같은 거임; 이렇게 하면 안돼
        int max = Arrays.stream(maxArr).max().getAsInt();
        System.out.println(max);

//        4. min
        int[] minArr = {10, 5, 100, 8};
        // getAsInt()
        // 사실 이렇게 하면 git push origin force랑 같은 거임; 이렇게 하면 안돼
        int min = Arrays.stream(minArr).min().getAsInt();

//        5. reduce : 누적연산 -> reduce(초기값, 연산식) / 연산식 : (a, b) -> a+b;
//        매개변수 2개, (a(a에다 값을 누적해서), b(누적된 값에 b를 더하겠다))
        int[] accArr = {10, 20, 30, 40, 50};
        int accArr1 = Arrays.stream(accArr).reduce(0, (a, b) -> a + b);
        int accArr2 = Arrays.stream(accArr).reduce(1, (a, b) -> a * b);
        System.out.println(accArr1);
        System.out.println(accArr2);

        String[] strArr = {"good", "man", "good", "girl"};
        String str = Arrays.stream(strArr).reduce("", (a, b) -> a + b);
        System.out.println(str);

//        6. findFirst : 첫번째 요소 반환
        String str2 = Arrays.stream(strArr).findFirst().get();
        String[] str3 = Arrays.stream(strArr).filter(a -> a.length() == 4).toArray(a -> new String[a]);
        System.out.println(Arrays.toString(str3));
    }
}
