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
//        int[] arr3 = new int[]{10, 20, 30, 40, 50}; //오른쪽만 봐도 int 배열인 지 알 수 있게끔 표현
//
////        배열표현식3. 예시
//        List<int[]> list = new ArrayList<>(); //List는 배열에 비해 유동적이다.
//        list.add(new int[5]); //값을 넣은 게 아니라 선언만 한것
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

////        선택(조합을 생각해봐도 되지 않을까)정렬 알고리즘 직접 구현 // n * log n (프로그램에서는 log의 밑이 2)
////          1. min값 찾기
////          2. 자리 change
////          3. 2중 for문 (index 주의)
//
//        int[] arr = {17, 12, 20, 10, 15};
//
////        for (int i = 0; i < arr.length; i++) {
////            int min = arr[i];
////            int minIndex = i;
////                for (j = i + 1; j < arr.length; j++) {
////                if (arr[j] < min) {
////                        min = arr[j];
////                        minIndex = j;
////                }
////            }
//////            자리 체인지 로직
////            int temp = arr[i];
////            arr[i] = arr[minIndex];
////            arr[minIndex] = temp;
////        }
////        Arrays.toString(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[j] < arr[i]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        } //얘는 복잡도 n^2

////        조합문제 : 모두 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 두 숫자의 조합을 문자열 형태로 출력
////        ex) (10,20), (10,30), (10,40), (10,50), (20,30), (20,40), (20,50), (30,40), (30,50), (40,50)
//        int[] intArr = {10, 20, 30, 40, 50};
//        for (int i = 0; i < intArr.length; i++) {
//            for (int j = i + 1; j < intArr.length; j++) {
//                System.out.println("(" + intArr[i] + "," + intArr[j] + ")");
//            }
//        }

////        배열의 중복 제거 : set 자료 구조(중복x, 순서x)를 활용하여 중복제거
//        int[] arr = {10, 10, 20, 30, 30, 40};
//        Set<Integer> mySet = new HashSet<>(); //Hashset = new Hashset이랑 똑같음, set이 더 큰 개념이라 이게 가능, list = new ArrayList할 때도 list가 더 큰 개념이라 가능
//        for (int a : arr) {
//            mySet.add(a);
//        }
//        System.out.println(mySet); //순서가 없음, 배열에 다시 담아주자
//        int[] answer = new int[mySet.size()];
//        int index = 0;
//        for (int a : mySet) { // set 값 뽑으려면? 무조건 inhanced for문 사용해야함
//            answer[index] = a;
//            index++;
//        }
//        Arrays.sort(answer);

////        프로그래머스 - 두 개 뽑아서 더하기 (조합 + 중복제거)
//        int[] numbers = {2, 1, 3, 4, 1};
//        Set<Integer> mySet = new HashSet<>();
//        for (int i = 0; i < numbers.length-1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                mySet.add(numbers[i] + numbers[j]);
//            }
//        }
//        int[] arr = new int[mySet.size()]; //단지 sort를 위한 배열일 뿐이다.
//        int index = 0;
//        for (int a : mySet) {
//            arr[index] = a;
//            index++;
//        }
//        Arrays.sort(arr); //정렬을 했다
//        System.out.println(Arrays.toString(arr)); //내 생각에는 잘 나와야 하는데 2 3 4 .. 0이 나오네??

////          배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        int target = 8;
////          8이 몇 번째 index에 있는 지 출력
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                System.out.println(i);
//                break;
//            }
//        }

////        이분탐색(이진검색) - binary search
////        사전에 데이터가 오름차순 정렬 돼 있을 경우, 이분탐색 가능 (log N)
////        오름차순 안 돼 있을 경우 n * log n + log n 이므로 더 복잡해짐,
///         (한계)값이 여러개 있으면 인덱스를 찾기가 힘들다
//        int[] arr = {1,3,6,8,9,11,15};
///          값이 있으면 해당 index 리턴
///          값이 없으면 해당 마이너스값 리턴
//        System.out.println(Arrays.binarySearch(arr, 15));

////        백준 수 찾기 문제(1920)
//        Scanner sc = new Scanner(System.in);
//
//        int N = Integer.parseInt(sc.nextLine());
//        String[] arr = sc.nextLine().split(" ");
//
//
//        int M = Integer.parseInt(sc.nextLine());

////          배열 값 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1 == arr2); // false
//        System.out.println(Arrays.equals(arr1, arr2)); //true

////        2차원 배열의 선언과 값 할당
////        {{1,2}, {1,2}, {1,2}}
//
//        int[][] arrr = new int[3][]; //가변배열
//        int[][] arr = new int[3][2];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//        arr[2][0] = 5;
//        arr[2][1] = 6;
//
////        리터럴 방식
//        int[][] arr2 = {{1,2},{3,4},{5,6}};
//
////        가변 배열 : 배열의 전체 길이는 반드시 할당.
////        이차원 배열의 출력 : Arrays.toString() 사용하면 arr3의 주소만 나옴
//        int[][] arr3 = {{1,2}, {1,2,3}, {1,2,3,4}};
//        System.out.println(arr3); //이차원 배열의 주소값
//        System.out.println(Arrays.toString(arr3)); //각 일차원 배열의 주소값들이 출력
//        System.out.println(Arrays.deepToString(arr3)); //각 일차원 배열의 값을 출력
//        for (int[] a : arr3) {
//            for (a : b) {
//                System.out.println(b);
//            }
//        }
//        int[][] arr4 = new int[3][];
//        arr4[0] = new int[2];
//        arr4[1] = new int[3];
//        arr4[2] = new int[4];


////        [3][4] 사이즈 배열 선언하고, 1~12까지의 숫자값을 각 배열에 순차적으로 할당
////        {1,2,3,4}, {5,6,7,8}, {9,10,11,12}
//        int[][] myArr = new int[3][4];
//        int num = 1;
//        for (int i = 0; i < myArr.length; i++) {
//            for (int j = 0; j < myArr[i].length; j++) {
//                myArr[i][j] = num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(myArr));

////        가변배열 값 채우기
//        int[][] varArr = new int[3][];
//        int num = 0;
//        for (int i = 0; i < varArr.length; i++) {
//            varArr[i] = new int[4]; //길이를 선언해줘야 한다.
//            for (int j = 0; j < varArr[i].length; j++) {
//                varArr[i][j] = num;
//                num++;
//
//            }
//        }

//        프로그래머스 - 행렬의 덧셈 // 덧셈을 어떻게 행위해야 하는가
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};
        int[][] result = new int[2][2];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(result));

//        프로그래머스 - K번째 수

////        배열 복사
////        Arrays.copyOf(배열명, length), Arrays.copyOfRange
//        int[] arr = {1,2,21,23,24,55,25};
//        int[] arr1 = Arrays.copyOf(arr, 4);
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = Arrays.copyOfRange(arr, 3, 6);
//        System.out.println(arr2);





    }
}

