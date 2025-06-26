package C05AnonymousLamda.Problem;

import java.util.*;
import java.io.*;

public class BOJ_1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       1.길이로 정렬 2. 길이가 같으면 문자열 정렬
        String[] baekjoon = new String[4];
        baekjoon[0] = ("no");
        baekjoon[1] = ("more");
        baekjoon[2] = ("more");
        baekjoon[3] = ("wait");
        Arrays.sort(baekjoon, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() - o2.length() == 0) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(Arrays.toString(baekjoon));

        Set<String> treeSet = new TreeSet<>(new Comparator<String>() { //HashSet은 순서가 없으므로 Comparator를 넣을 수 없음
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() - o2.length() == 0) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(treeSet);




//        int input = Integer.parseInt(br.readLine());
//
//        List<String> wordList = new ArrayList<>();
//
//        for (int i = 0; i < input; i++) {
//            wordList.add(i, br.readLine());
//        }
//        String[] wordArray = new String[wordList.size()];
//
//        Arrays.sort(wordArray, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });





    }
}
