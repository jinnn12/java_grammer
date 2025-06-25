package C06EtcClass;

public class C01Math {
    public static void main(String[] args) {
//        Math.random() : 임의의 수 반환. 0.0 ~ 1.0 범위의 double형 반환
        System.out.println(Math.random());
//        로또 번호 7개 뽑기 0 ~ 99까지의 임의의 숫자 (1 ~ 45 도 만들어보장)
        for (int i = 0; i < 7; i++) {
            System.out.println((int) (Math.random()*100));
        }

//        Math.abs() : 절댓값 반환
        System.out.println(Math.abs(-5));

//        Math.ceil() : 올림, Math.floor() : 내림, Math.round() : 반올림
        System.out.println(Math.ceil(5.7)); //6.0
        System.out.println(Math.floor(5.7)); //5.0
        System.out.println(Math.round(5.7)); //6.0

//        Math.max(a, b) : 두 수의 최댓값 / Math.min(a, b) : 두 수의 최솟값
        System.out.println(Math.max(10, 30));
        System.out.println(Math.min(10, 30));

//        Math.pow(a, b) : a^b
        System.out.println(Math.pow(2,3));

//        Math.sqrt(a) : a의 제곱근 (걍 루트라고 생각ㄱㄱ)
        System.out.println(Math.sqrt(100));
        // 소수검증할때 쓸 수 있다.






    }
}
