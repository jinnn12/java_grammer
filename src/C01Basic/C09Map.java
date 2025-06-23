package C01Basic;
import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class C09Map {
    public static void main(String[] args) throws IOException{
//        key, value로 이루어진 자료구조
//        key값은 중복이 있으면 value를 덮어쓰기. //제거도 key값으로 함
//        Map<String, Integer> sports = new HashMap<>();
//        sports.put("농구", 2);
//        sports.put("배구", 1);
//
//
////        map은 key를 통해 value를 get
////        map에서 key 값을 통한 검색 복잡도는 O(1)
//        System.out.println(sports.get("농구"));
//
////        map의 전체 데이터 출력
////        map의 key값 접근 시 인덱스 사용은 불가능 (순서가 없으므로)
////        keySet() : map의 key 목록을 리턴하는 메서드
////        values() : map의 value 목록을 리턴
//        int total = 0;
//        for (int v : sports.values()) {
//            total += v;
//        }
//        int total2 = 0; //조금 더 일반적인 값 꺼내는 방법. keySet 후 get().
//        for (String k : sports.keySet()) {
//            total2 += sports.get(k); //k는 key값이니까 key에 있는 value를 get해서 total2에 더해줌.
//        }

////        remove : 키를 통해 map의 요소 삭제
//        sports.remove("농구");
//        System.out.println(sports);

////        map에서 기존의 key값에 put할 경우 덮어쓰기 (!= 추가 되는 것이 아님)
//        sports.put("배구", 10);
//        System.out.println(sports);

////        map에서 기존의 key값에 put할 경우 덮어쓰기 (!= 추가 되는 것이 아님)
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동"); //put이 안되겠지, soccer에 축구가 저장돼있잖아.
//        sports.putIfAbsent("Tennis", "테니스");
//        System.out.println(sports);

////        containsKey : key가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("Tennis"));
//        System.out.println(sports.containsKey("pingpong"));

////        map 출력 방법 2가지 : 1. for-each (일반 for문 index는 안돼 순서가 없잖아) 2.iterator
////        1. for-each문
//        for (String a : sports.keySet()) { //Set을 출력한 것, 자료구조는 Set // map 자체로는 출력을 못한다.
//            System.out.println(a); //key
//            System.out.println(sports.get(a)); //value
//        }
//        Set<String> mySet = sports.keySet(); // key를 쏙 뽑아서 Set으로 바꿈, Set에는 key값만 들어가 있음, for-each문을 통해서 key값을 하나씩 꺼낸다.
//        for (String a : mySet) {
//            System.out.println(a);
//        } //위엣 것과 같음. 어차피 map을 Set으로 바꾸는 것이기 때문이다.

////        2. iterator 활용 : 멀티데이터를 iterator라고 하는 객체로 만들어준다. 효용은 떨어지나 spring으로 가게 되면
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
//        Iterator<String> iterators = sports.keySet().iterator();
////        next 메서드는 데이터를 하나씩 소모시키면서 값을 반환
//        System.out.println(iterators.next()); //순서는 없다, 여기선 keySet

////        hasNext 메서드 iterator 안에 그 다음 값이 있는지 없는지 boolean으로 리턴. (isEmpty와 비슷)
//        System.out.println(iterators.hasNext());

//        while (iterators.hasNext()) {
//            System.out.println(iterators.next());
//        } // 이 패턴은 외우자.

////        map은 key의 value 수를 count 하는 목적으로 많이 활용
//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
////        농구 : 2, 축구 : 2, 야구 : 1
//        Map<String, Integer> myMap = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (myMap.containsKey(arr[i])) { // 값이 있으면 +1
//                myMap.put(arr[i], myMap.get(arr[i]) + 1);
//            } else { // 없으면 초기값 1로 설정
//                myMap.put(arr[i], 1);
//            }
//        }

////            getOrDefault(키값, 초기값) : key값이 없을 경우 초기값 리턴
//            myMap.put(arr[i], myMap.getOrDefault(arr[i], 0)+1);
//        }
//        System.out.println(myMap);

//        String[] removeArr = {"농구", "농구", "농구", "야구", "축구"};
////        농구 2 -> 0 / 야구 1 -> 0 / 축구 2 -> 1
//
//        for (String r : removeArr) {
//            if (myMap.containsKey(r)) { // key값이 있는지 없는지
//                if (myMap.get(r) == 1) { // get(r)이 1인 경우 remove
//                    myMap.remove(r);
//                } else {
//                    myMap.put(r, myMap.get(r)-1) // 2 이상인 경우 하나씩 빼주는 로직
//                }
//            }
//        }

//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        myMap.put("야구", 1);
//
////        가장 value가 큰 key값 찾기
//        int max = Integer.MIN_VALUE;
//        String maxKey = " ";
//
//        for (String a : myMap.keySet()) {
//            if (myMap.get(a) > max) {
//                max = myMap.get(a);
//                maxKey = a;
//            }
//        }
//        System.out.println(maxKey);

//        백준 - 베스트셀러 (1302번)

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int sellCount = Integer.parseInt(br.readLine());
//        Map<String, Integer> book = new HashMap<>();
//
//        String b = " ";
//        for (int i = 0; i < sellCount; i++) {
//            String name = br.readLine();
//            if (!book.containsKey(name)) {
//                book.put(name, 1);
//            } else {
//                book.put(name, book.get(name)+1);
//            }
//        }
//        int max = Integer.MIN_VALUE;
//        for (String k : book.keySet()) {
//            if (book.get(k) > max) {
//                max = book.get(k);
//
//            }
//        }

//        int max = Integer.MIN_VALUE;
//        String maxKey = "";
//        for (String k : myMap.keySet()) {
//            if (myMap.get(k) > max) {
//                max = myMap.get(k);
//                maxKey= k;
//            }
//        }
//        System.out.println(maxKey);

//        프로그래머스 - 완주하지 못한 선수
//        map 활용 할 경우 : 참여자를 모두 map에 담기, 완주한 사람을 map에서 차감. 마지막에 남은 사람은 완주 못한 사람.
//        정렬로 풀 수도 있음. (정렬은 무조건 복잡도 n*log n)

//        프로그래머스 - 의상

////        LinkedHashMap : 데이터의 삽입 순서를 보장
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5", 1);
//        linkedMap.put("hello4", 2);
//        linkedMap.put("hello3", 3);
//        linkedMap.put("hello2", 4);
//        linkedMap.put("hello1", 5);
//        for (String a : linkedMap.keySet()) {
//            System.out.println(a);
//        }

////        TreeMap : key를 정렬(오름차순)하여 map을 저장 / 정렬이 들어가면 복잡도 n*log n
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5", 1);
//        treeMap.put("hello4", 2);
//        treeMap.put("hello3", 3);
//        treeMap.put("hello2", 4);
//        treeMap.put("hello1", 5);
//        for (String a : treeMap.keySet()) {
//            System.out.println(a);
//        }

//        백준 - 파일정리
//        문자열 자르기 : .은 특수 문자로 취급되어 "." -> "\\."

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        String[] fileN = br.readLine().split("\\.");
//        TreeMap<String, String> treeMap = new TreeMap<>();
//        int count = 0;
//        for (int i = 0; i < fileN.length; i++) {
//            if (treeMap.containsKey(fileN[i])) {
//                treeMap.put(fileN[i], treeMap.get(fileN[i]));
//            } else {
//                treeMap.put(fileN[i], treeMap.get(fileN[i]));
//            }
//        }



    }
}
