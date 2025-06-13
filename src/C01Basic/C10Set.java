package C01Basic;
import java.util.*;

public class C10Set {
    public static void main(String[] args) {
//        중복X, 순서보장X
        Set<String> mySet = new HashSet<>(); //for each문 활용해서 꺼내야 한다
        mySet.add("h");
        mySet.add("h");
        mySet.add("e");
        mySet.add("l");
        mySet.add("l");
        mySet.add("o");
        System.out.println(mySet);

    }
}
