package Practice;

import java.util.*;

public class C13RecursivePractice {
    public static void main(String[] args) {
        // n중 for문을 활용하여 helloworld1 helloworld2 ... helloworldn 출력
        int total=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("helloworld"+total);
                total++;
            }
        }

        // 숫자 1,2,3,4를 가지고 만들 수 있는 2개짜리 숫자조합을 이중리스트에 담아 출력
        // [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        List<List<Integer>> doubleList = new ArrayList<>();
        for(int i = 0; i < myList.size()-1; i++){
            List<Integer> temp;
            for(int j=i+1; j < myList.size(); j++){
                temp=new ArrayList<>();
                temp.add(myList.get(i));
                temp.add(myList.get(j));
                doubleList.add(temp);
            }
        }
        System.out.println(doubleList);
    }
}
