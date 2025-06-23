package C01Basic;
import java.io.*;

import java.util.*;

public class C10Set {
    public static void main(String[] args) throws IOException {
//        중복X, 순서보장X
//        Set<String> mySet = new HashSet<>(); //for each문 활용해서 꺼내야 한다
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);


////        백준 : 숫자 카드(10815)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        br.readLine();
//        String[] strN = br.readLine().split(" ");
//        br.readLine();
//        String[] strM = br.readLine().split(" ");
//        Set<String> set1 = new HashSet<>();
//        for (String a : strN) {
//            set1.add(a);
//        }
//        StringBuffer sb = new StringBuffer();
//        for (String a : strM) {
//            if (set1.contains(a)) {
//                sb.append("0")
//            }
//        }

//        프로그래머스 : 폰켓몬 (nums.length vs set.size())

////        LinkedHashSet : 입력 순서 보장
//        Set<Integer> linkedSet = new LinkedHashSet<>();
//        linkedSet.add(1);
//        linkedSet.add(1);
//        linkedSet.add(0);
//        linkedSet.add(3);
//        linkedSet.add(1);
//        System.out.println(linkedSet); // 1 0 3
//
////        TreeSet : 데이터를 오름차순 정렬
//        Set<Integer> treeSet = new TreeSet<>();
//        treeSet.add(1);
//        treeSet.add(1);
//        treeSet.add(0);
//        treeSet.add(3);
//        treeSet.add(1);
//        System.out.println(treeSet); // 0 1 3

//        집합 관련 함수 : 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
        Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("python");
        set1.add("C++");
        Set<String> set2 = new HashSet<>();
        set2.add("java");
        set2.add("html");
        set2.add("css");

        set1.retainAll(set2); // set1에는 java만 남음, 교집합 결과를 set1에 할당한 것.
        System.out.println(set1);
        set1.addAll(set2);
        System.out.println(set1);
        set1.removeAll(set2);
        System.out.println(set1); //python, C++ 남음





    }
}
