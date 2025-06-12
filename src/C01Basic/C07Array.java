package C01Basic;

import java.lang.reflect.Array;
import java.util.*;

public class C07Array {
    public static <Int> void main(String[] args) {
////        배열표현식1. 배열 선언 후 할당 방식
////        배열은 반드시 사전에 길이가 결정되어야 함.
//        int[] arr1 = new int[5];
//        arr1[0] = 10;
//        arr1[2] = 30;
//        arr1[3] = 40;
//        arr1[4] = 50;
//        //arr1[5] = 10; //ArrayIndexOutOfBoundsException 발생. 배열 길이가 동적으로 늘어날 수 없음.
//        System.out.println(arr1[2]); //int배열의 경우 0으로 초기화, String배열은 null로 초기화

////        배열표현식2. 리터럴 방식
//        int[] arr2 = {10, 20, 30, 40, 50};
//
////        배열표현식3.
//        int[] arr3 = new int[]{10, 20, 30, 40, 50}; //오른쪽만 봐도 int 배열인 지 알 수 있게 끔 표현
//
////        배열표현식3. 예시
//        List<int[]> list = new ArrayList<>();
//        list.add(new int[5]);
//        list.add(new int[]{1, 3, 5, 7});
//
//        System.out.println(list.get(1)[0]);
//
////        배열표현식4 : 불가 -> 배열의 길이를 반드시 확정 시켜야 함.
//        //int[] arr4 = new int[];

////        Arrays.fill : 배열에 모든 값을 변경하는 메서드
//        String[] arr = new String[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = " ";
//        }
//
//        Arrays.fill(arr, ""); // Arrays.~ -> 클래스 메서드

////      85, 65, 90으로 구성된 int배열을 선언하고, 총합과 평균을 구해보시오,
//        int[] arr = {85, 65, 90};
//        int sum = 0;
//        int avg = 0;
//        System.out.println(arr[0] + arr[1] + arr[2]);
//        System.out.println((arr[0] + arr[1] + arr[2]) / arr.length);
//
//        int total = 0;
//        for (int i = 0; i < arr.length; i++) {
//            total += arr[i];
//        }
//        System.out.println("총합은 " + total);
//        System.out.println("평균은 " + (double) total / arr.length);

////      배열의 최댓값, 최솟값 : 시작 숫자 아무거나 고정, 이후 시작값 잡고 하나하나 비교
//        int[] arr2 = {10, 20, 30, 12, 8, 17};
//        int max1 = Integer.MIN_VALUE;
//        int min1 = Integer.MAX_VALUE;
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] > max1) {
//                max1 = arr2[i];
//            }
//            if (arr2[i] < min1) {
//                min1 = arr2[i];
//            }
//        }
//        System.out.println(max1);
//        System.out.println(min1);
//        System.out.println(Arrays.stream(arr2).max()); // .max를 사용하면 max를 구할 수 있다.
//
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] < min1) {
//                min1 = arr2[i]
//            }
//        }
//
//        int max = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] >= max) {
//                max = arr2[i];
//            }
//        }
//        System.out.println(max);
//        int min = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] < min) {
//                min = arr2[i];
//            }
//        }
//        System.out.println(min);

////       배열의 자리 바꾸기
//        int[] arr = {20, 10, 30};
//        int temp = arr[0]; //잠깐 킵해놓아야 함. arr[0] 값 유실 방지!
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

////        배열 뒤집기
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] newArr = new int[arr.length];
//        int index = 0;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            newArr[index] = arr[i];
//            index++;
//        } // index--; 도 한 번 그려보장
//
//        int temp = arr[0];
//        arr[0] = arr[4];
//        int temp2 = arr[1];
//        arr[1] = arr[3];
//        arr[3] = temp2;
//        arr[4] = temp;
//        System.out.println(Arrays.toString(arr));


////        배열의 정렬
//        int[] arr = {17, 12, 20, 10, 15};
//        Arrays.sort(arr); //오름차순 정렬. 무조건 외우기
//        // Arrays.sort(arr, Comparator.reverseOrder()); -> 숫자는 내림차순 정렬 불가능,
//        // comparator는 클래스 기반 메서드, 클래스를 통한 객체만 정렬 가능,
//        // int는 원시 자료형이라 안됨. String은 클래스객체니까 가능!
//        Integer[] arr2 = {17, 12, 20, 10, 15}; //이거는 클래스 객체로 바꿨으니 comparator 가능, int로 받고 싶으면 걍 int 오름차순 정렬 이후에 뒤집어주면 됨.
//
//
//
//        System.out.println(Arrays.toString(arr));
//
//        String[] stArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(stArr, Comparator.reverseOrder()); //내림차순 정렬, 이것도 외우자..^^
//        System.out.println(Arrays.toString(stArr));

//        선택정렬 알고리즘 직접 구현
//          1. min값 찾기
//          2. 자리 change
//          3. 2중 for문 (index 주의)
//            for(){
////            min값을 찾기위한 for문
//            for(){

                int[] arr = {17, 12, 20, 10, 15};


    }
}
