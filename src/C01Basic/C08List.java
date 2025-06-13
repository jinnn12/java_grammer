package C01Basic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
////        List선언 방법
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
////        List선언 방법2 : 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>(); // List가 ArrayList, LinkedList의 인터페이스
//
////        초기값 세팅방법1. 개별 data add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("c++");
//
//        System.out.println(myList3); //원래라면 객체라서 메모리주소가 출력이 돼야 하는데 최신기술이라 toString이 자동적용
//
////        초기값 세팅방법2. 배열을 리스트로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
//        int[] intArr = {10, 20, 30}; //원시자료형이라 Arrays.asList() 불가능
//        List<Integer> myIntList = new ArrayList<>();
//        for (int i : intArr) {
//            myIntList.add(i);
//        }
//
////        add메서드 : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0, 30); //0번째 인덱스에 30을 추가하겠다.
//        System.out.println(myList); //List는 중간 데이터 삽입/삭제 성능 비효율적, 지양한다.
//
////        get(index) : 특정 index 요소 반환
//        System.out.println(myList.get(0));
//
////        size() : 리스트의 개수( )를 반환
//        System.out.println(myList.size());
//
////        for문을 활용해서 myList값 하나씩 모두 출력
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//        for(int m : myList) {
//            System.out.println(m);
//        }

////        remove : 요소 삭제
//        List<Integer> myList = new ArrayList<>();;
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
////        1) index를 통한 삭제 2) value를 통한 삭제 (중복될 수 있으므로 일반적이지 않음)
//        myList.remove(0);
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(30));
//        System.out.println(myList);
////        clear : 요소 전체 삭제
//        myList.clear();
//        System.out.println(myList.isEmpty()); //clear해서 true
//
////        incexOf : 특정 값을 찾아 index return (중복의 경우 가장 먼저 나오는 인덱스 값 리턴)
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        myList2.add(30);
//        System.out.println(myList2.indexOf(30));
//
////        contains : 값이 있는 지 없는 지 여부를 리턴 / 시간복잡도 n
//        System.out.println(myList2.contains(20));

//        프로그래머스 - n의 배수 고르기


////        정렬 : 방법2가지 ( Collections클래스 사용, 객체 사용 )
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
////        Collections.sort() /외우자
//        Collections.sort(myList); //오름차순, sort > collection이라는 클래스에 정의
//        Collections.sort(myList, Comparator.reverseOrder()); //내림차순
//        System.out.println(myList);
//
////        객체(ArrayList클래스).sort()
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

////        이중리스트 : 리스트 안의 리스트
////        [[1,2], [3,4], [5,6]]
//        List<List<Integer>> myList = new ArrayList<>(); //왼쪽 List는 인터페이스 (껍데기), 실체는 오른쪽 ArrayList, 0번째 리스트, 1번째 리스트 갖고 있음
//        List<Integer> myList1 = new ArrayList<>();
//        myList.add(myList1);
//        myList.add(new ArrayList<>());
//        //myList.add(10) 하면 일차원 리스트에만 해당되기 때문에 안돼요~
//        myList.get(0).add(1);
//        myList.get(0).add(2); // [[1,2], []]
//        myList.get(1).add(3);
//        myList.get(1).add(4); // [[1,2], [3,4]]
//        myList.add(new ArrayList<>());

//        for문을 이용해서 [[1,2,3], [4,5,6], [7,8,9], [10,11,12]] 이중리스트 생성
        List<List<Integer>> myList = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < 4; i++) {
            myList.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                myList.get(i).add(num);
                num++;
            }
        }
        System.out.println(myList);

////        리스트 안에 배열도 만들 수 있다
////        [{1,2}, {1,2,3}, {1,2,3,4}]
//        List<int[] > mylist2 = num ArrayList()
//        new
//        myList2.add (10) [1] =0
//        myList2.add(0)[0];
//        myList2.add(0)[1];
//        myList2.add (20)
//        myList2.add (20)
//        myList2.add (g랴=)
//        myList2.add (g랴=)
//        myList2.add (g랴=)
//        for(int[] m : mylist2) {
//            System.out.println(Arrays.toString(m)); //그냥 Sting 썼으면 주소값 출력
//        }







    }
}
