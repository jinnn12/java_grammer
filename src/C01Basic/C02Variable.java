package C01Basic;

import java.math.BigDecimal;

public class C02Variable {

    public static <Bigdecimal> void main(String[] args) {
////      정수 : byte(1바이트), int(4바이트), long(8바이트)
//        byte a = 127;
//        byte b = -128; //RDB의 TINYINT와 비슷
//
////  오버플로우
//        a++;
////  언더플로우
//        b--;
//        System.out.println(a);
//        System.out.println(b);
//
//        int i1 = 10;
//        long l1 = 10;
//        // 시간효율성(시간복잡도) -> 계산시간 / 공간효율성(공간복잡도) -> 메모리
//
//       long은 명시적으로 L을 붙여 long 타입임을 명시하기도 함.
//        long l2 = 20L;
//
//        실수 : float, double -> 실수 연산은 오차를 발생 시킴. 이진연산의 한계
//        float f1 = 1.123f;
//        double d1 = 1.123;
//
//        부동소수점 오차 테스트
////        double d2 = 0.1;
////        System.out.println(d2);
////
////        double total = 0;
////        for (int i = 0; i < 1000; i++) {
////            total = total + 0.1;
////        }
////        System.out.println(total);
////
//////        소수점 연산 오차 해결 방법 : 정수로 변환 후 연산하여 추후 나눗셈으로 해결.
////        double total2 = 0;
////        for (int i = 0; i < 1000; i++) {
////            total2 = total2 + 0.1;
////        }
////        System.out.println(total2/10);
////
////        소수점 오차 해결 방법 : Bigdecimal 클래스 사용
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1 - d2);
//        BigDecimal b1 = new BigDecimal("1.03"); //값을 입력 받을 때부터 소숫점으로 받게 되면 이미 오차가 발생하므로 문자로 입력.
//        BigDecimal b2 = new BigDecimal("0.42");
//        double d3 = b1.subtract(b2).doubleValue();
//        System.out.println(d3);
//
////      문자형 : char / 문자열의 차이를 봐야 한다.
//        char c1 = '가';
//        String st1 = "가나";
//        System.out.println(c1);

//        boolean은 true or false
//        boolean b1 = false;
//        if (b1) {
//            System.out.println("참입니다.");
//        } else {
//            System.out.println("거짓입니다.");
//        }

//        null도 하나의 타입
//        참조형자료에 값을 할당하지 않으면 null이 할당된다.
//        String st1 = "";
//        String st2 = null;
//        String st3;
////        System.out.println(st1.isEmpty());
////        System.out.println(st2.isEmpty()); //null을 대상으로 String의 메서드 사용 불가
////        String[] arr = new String[5];
////        arr[1] = "hello1";
////        arr[3] = "hello3";
////        for (int i = 0; i < 5; i++) {
////            System.out.println(arr[].length);
////        }
//
////        타입변환
////        묵시적타입변환
//        char c1 = 'a';
//        int i1 = c1;
//        System.out.println(i1);
////        문자 비교를 위한 묵시적 타입 변환
//        System.out.println('a' > 'b');
//
////        알파벳 소문자 제거 문제
//        String st1 = "01abcd123한글123";
//        String answer = "";
//        for (int i = 0; i < st1.length(); i++) {
//            char ch = st1.charAt(i);
//            if (ch < 'a' || ch 'z';)
//
//        }
//
////        double -> int
//        int u1 = 10;
//
//
////        명시적타입변환

////        변수와 상수
//        int a1 = 10;
////        변수값 재할당은 가능
//        a1 = 20;
////        변수값 재선언하는 것은 불가능
//        int a1 = 30;
//
////        상수는 초기값을 할당한 이후에 재할당하는 것이 불가능
////        상수는 final 키워드를 사용
//        final int f1 = 20;
//        f1 = 30;


    }
}

