package C08Thread;

public class MyThread extends Thread { // Thread : 멀티스레드를 만드는 클래스이다.
//    Thread클래스에 내장된 run메서드는 비어있는 메서드이다.
//    run메서드는 thread가 시작될 때 자동으로 호출되는 메서드
//    스레드 실행 시 특정 작업을 수행하고 싶다면, run 메서드를 overriding해서 코드작성.
    @Override
    public void run() {
        System.out.println("스레드 실행 시작(MyThread)");

    }

}
