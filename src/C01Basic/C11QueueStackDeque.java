package C01Basic;
import java.util.*;

import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueueStackDeque {
    public static void main(String[] args) {

////        Queue인터페이스를 LinkedList가 구현한 아래와 같은 방식을 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//
////        poll : queue에서 데이터를 삭제하면서 동시에 return하는 메서드
//        int temp = myQue.poll();
//        System.out.println(temp); // 10
//        System.out.println(myQue); // 20 30
////        peek : queue에서 데이터를 삭제하지 않고 가장 앞의 데이터를 반환(확인만 함)
//        int temp2 = myQue.peek();
//        System.out.println(temp2);
//        System.out.println(myQue);
//
////        LinkedList와 ArrayList 성능 차이 비교
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            linkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedList에 값 중간 add 시 소요 시간 : " + (endTime - startTime));
//
//        long startTime2 = System.currentTimeMillis();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < 100000; i++) {
//            arrayList.add(0, i);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList에 값 중간 add 시 소요 시간 : " + (endTime2 - startTime2));
//
////        0616 -> Map이랑 Set 위주로 문제를풀어보세요

//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        myQue.add("문서4");
//        int size = myQue.size();
//        for (int i = 0; i < myQue.size(); i++) {
//            System.out.println(myQue.poll());
//        }
////        queue는 일반적으로 while문을 통해 요소를 소모 (for문은 적절치 않다, 사이즈가 지속적으로 변해)
//        while (!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//            2개씩 poll을 할 경우에는 queue가 empty가 되지 않도록 유의.

//        백준 - 카드2
//        백준 - 요세푸스 문제 0
//        (원이면 큐를 떠올리는 게 맞지 않을까?
//        자료구조가 일직선인데 원을 기준으로 하면 다시 만나야 하니까
//        다시 만나려면 뒤로 보내야 함, 고로 큐를 떠올려야 하지 않나?)

////        길이 제한 큐
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        /// /        blockingQueue.add("문서1");
        /// /        blockingQueue.add("문서2");
        /// /        blockingQueue.add("문서3");
        /// /        blockingQueue.add("문서4");
        /// /        offer : 길이제한 될 경우 제한된 길이까지만 insert.
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);

////    우선 순위 큐 : 데이터를 poll할 때 정렬(n * log n)된 데이터 결괏값(최솟값) 보장 / 매우중요
////    전체 데이터가 계속 변경되면서 지속적으로 최솟값(복잡도 : n)을 추출해야 하는 경우?
////    그냥 List에선 계속 list n번이 변경되면 n^2 / pq에선 n번 변경 시 n log(n)
////    하나씩 뽑을 때마다 정렬이 된다.
////    현대적인 알고리즘에서 n*log n만큼 효율적인 것은 없다
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); //add 할 때 까지는 전체 정렬이 돼 있지 않음.
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll()); //1개 poll 할 때마다 최솟값을 뽑아낸다. log(n) 복잡도
//        }
//
////        백준 - 최소힙 (왜 이 상황에서 pq를 써야하는지 고민을 하며 풀어보기)
//
////        최대힙
//        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
//        pq2.add(30);
//        pq2.add(20);
//        pq2.add(10);
//        pq2.add(40);
//        pq2.add(50);
//        System.out.println(pq2); //add 할 때 까지는 전체 정렬이 돼 있지 않음.
//        while (!pq2.isEmpty()) {
//            System.out.println(pq2.poll()); //1개 poll 할 때마다 최솟값을 뽑아낸다. log(n) 복잡도
//        }

//        프로그래머스 - 더 맵게

////        stack : 후입선출
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack.pop()); //제거되면서 값 return
//        System.out.println(stack.peek()); //값만 return(제거x)
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());

//        프로그래머스 : 같은 숫자는 싫어
//        프로그래머스 : 올바른 괄호 (Deque로 풀기)

//        Deque : addLast, pollLast, pollFirst, peekFirst, peekLast
        Deque<Integer> d1 = new ArrayDeque<>(); //구현체는 ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20); //보통은 시간순서대로 addLast 함
        d1.addFirst(30);

        System.out.println(d1.pollLast());
        System.out.println(d1.pollFirst());
        System.out.println(d1.peekLast());

//        0617 -> dfs/bfs 예습 / 주요자료구조 : 배열, 리스트, map, set, queue, stack, deque
//        배열, 리스트 전체 리뷰 한 번 해야 함. 리스트는 배열과의 차이점이 뭐가 있는지
//        String 문제, 주요 자료구조에 대한 문제들. 오늘 한 번 정리를 다 해야 함.

    }
}




