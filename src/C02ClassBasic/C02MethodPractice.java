package C02ClassBasic;

import java.util.*;

public class C02MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        if (isPrime(input)) {
            System.out.println("입력하신 숫자는 소수입니다.");
        } else {
            System.out.println("입력하신 숫자는 소수가 아닙니다.");
        }
    }

    //    소수 판별기 메서드 생성 (isPrime 생성)
    public static boolean isPrime(int a) { //왜 static인가 -> 클래스 메서드에서 사용하려면 클래스 메서드 필요
        boolean check = true;
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }


}
