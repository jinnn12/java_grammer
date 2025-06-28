package C08Thread;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
////        단일스레드 실행
//        for (int i = 0; i < 1000; i++) {
//            Library.borrow();
//        }
//        System.out.println(Library.getBookCount()); // 단일스레드에선 재고수 0, 멀티스레드로 가면 음수가 나온다?!

//        멀티스레드 생성 (방법이 중요한게 아니라 개념, 문제발생시 해결이 중요함)
////        방법1.스레드 클래스 상속 방식 (Thread : 부모클래스)
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();
//        Thread t3 = new MyThread();
//        Thread t4 = new MyThread();
////        Thread 클래스 안에 start 메서드 내장되어있고, start 메서드는 run 호출하면서 스레드 생성
////        각 스레드의 코드의 실행순서는 보장되지 않음. (Library의 borrow를 호출한다는게 먼말?0)
//        t1.start(); // start() 안에 run 메서드 있음
//        t2.start();
//        t3.start();
//        t4.start();
//        System.out.println("hello world");
////        => (4+1)5개의 스레드가 동시에 실행됨. sout도 스레드

//        방법2.Runnable을 직접 구현한 객체를 Thread클래스 생성자에 주입하는 방식
//        run 메서드를 쓰기 위해
//        Thread t1 = new Thread(() -> System.out.println("스레드 실행 시작(MyThread)")); // t1.start() 를 쓰기 위해
//        t1.start();
        new Thread(() -> System.out.println("스레드 실행 시작(MyThread)1")).start(); // 굳이 변수를 안 받고 구현체로 실행
        new Thread(() -> System.out.println("스레드 실행 시작(MyThread)2")).start(); // 굳이 변수를 안 받고 구현체로 실행
        new Thread(() -> System.out.println("스레드 실행 시작(MyThread)3")).start(); // 굳이 변수를 안 받고 구현체로 실행
        new Thread(() -> System.out.println("스레드 실행 시작(MyThread)4")).start(); // 굳이 변수를 안 받고 구현체로 실행
        System.out.println("hello world");

//        멀티스레드 동시성 이슈 테스트
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(() -> Library.borrow()); // 스레드가 시작될때마다 borrow 실행, 즉 스레드 1000개
            t1.start();
            t1.join(); // 한 스레드의 작업이 모두 완료될 때, 다른 스레드 생성하여 작업 수행. -> 사실상 단일스레드 처럼 동작하므로 성능저하가 발생함ㅗ
        }
        Thread.sleep(20000);
        System.out.println(Library.getBookCount()); // main스레드가 실행, 얘도 동시에 실행돼서 원하는 bookcount 안나옴


    }
}
