package C02ClassBasic;

public class C01Method {
    public static void main(String[] args) {
////        for문을 이용해 1~10까지 total값 가산 후 출력
//        int total = 0;
//        for (int i = 1; i < 11; i++) {
//            total += i;
//        }
//        System.out.println(total);
//
////        for문을 이용해 10~20까지 total값 가산 후 출력
//        int total2 = 0;
//        for (int i = 10; i < 21; i++) {
//            total2 += i;
//        }
//        System.out.println(total2);

//프로그래밍 아키텍처에서는 중복을 방지하고 싶어 한다.
//위 코드의 중복이 지속적으로 발생하므로 반복을 피하기 위해 위 코드의 기능을 모듈화하여 별도로 분리 -> 메서드
//        클래스메서드 기본 호출 방식 : 클래스명.메서드명()
        System.out.println(C01Method.sumAcc(1, 10));
        System.out.println(C01Method.sumAcc(10, 20));
//        같은 클래스 내에서 정의된 클래스 메서드의 호출은 클래스명 생략 가능
        System.out.println(sumAcc(1, 10));

    } // 메인메서드가 끝나는 자리

//    접근제어자(public), 클래스 메서드 여부(static O : 클래스 메서드 / static X : 객체 메서드), 반환타입(int, String, 배열 등), 매개변수 (input값)
    public static int sumAcc(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }



}
