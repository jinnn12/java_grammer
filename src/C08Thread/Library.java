package C08Thread;

public class Library {
    private static int bookCount = 100;
//    public static void borrow() {
//    synchronized : 메서드 내에서 1개의 스레드만 실행되도록 강제
//    RDB에 재고관리를 할 경우, syncronized를 통한다 하더라도, 쿼리와 commit 실행 시점 차이로 인해 RDB에서 미세한 동시성이슈 발생
//    => synchronized하더라도 완벽히 동시성이슈가해결이 되지 않음을 의미
//    이를 붙임으로써 '메서드 앞'에서 스레드들이 줄 서서 기다림.
//    public synchronized static void borrow() {
        public static void borrow() {
        if (bookCount > 0) {
            try {
                Thread.sleep(100); // 잠깐 기다려?? 그리고 이게 왜 멀티스레드로 취급이 되는가
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookCount-=1;
            System.out.println("대출완료");
        } else {
            System.out.println("대출불가");
        }
    }
    public static int getBookCount() {
        return bookCount;
    }
}
