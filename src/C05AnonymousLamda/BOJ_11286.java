package C05AnonymousLamda;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class BOJ_11286 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                } else {
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });


    }
}
