package C01Basic;
import java.util.*;
import java.io.*;

public class C04IfStatement {

    public static void main(String[] args) {
//        도어락 해제

//        Scanner sc = new Scanner(System.in);
//        int answer = sc.nextInt();
//        if (answer == 1234) {
//            System.out.println("문이 열렸습니다.");
//        } else {
//            System.out.println("비밀번호가 틀립니다.");
//        }

////        버스카드 예제
//        현재 가지고 있는 돈은 얼마인 지 묻는다.
//        입력 값을 받아서 10000원 이상이면 택시를 타시오 출력
//        10000미만 ~ 3000원이상이면 버스를 타시오 출력
//        그렇지 않으면 걸어가라고 출력
//        Scanner sc = new Scanner(System.in);
//        int bank = Integer.parseInt(sc.nextLine());
//        if, else if 구문에서 조건식 2개 중 택 1이다!
//        if (bank >= 10000) {
//            System.out.println("택시를 타시오.");
//        } else if (3000 <= bank) {
//            System.out.println("버스를 타시오.");
//        } else {
//            System.out.println("돈 없으면 걷자!");
//        }

////        if문이 독립적으로 존재할 경우에는 정확한 범위 지정을 하지 않으면 모든 if 문이 중복되어 실행될 가능성이 존재
//        if (bank >= 10000) {
//            System.out.println("택시를 타시오.");
//        }
//        if (3000 <= bank && bank < 10000) {
//            System.out.println("버스를 타시오.");
//        } else if (bank < 3000){
//            System.out.println("걸어가시오.");
//        }

////        삼항연산자 : 결과값 = 조건식 ? 반환값1 : 반환값2
////        조건식이 참인 경우 반환값1이 결과값에 담기고, 거짓인 경우 반환값2가 결과값에 담김.
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = Integer.parseInt(sc.nextLine());
//        String result = (answer == input) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다";
//        System.out.println(result);


    //    switch문 : if, else if, else if 등 여러 조건 식이 있을 때 조건문을 가독성 있게 표현한 구문
//    원하시는 서비스 번호를 입력해주세요.
//    1: 대출업무입니다, 2: 예금업무입니다, 3:적금업무입니다, 0:상담사연결됩니다. 그외 : 잘못된 입력입니다.
    Scanner sc = new Scanner(System.in);
    int number = Integer.parseInt(sc.nextLine());

    switch (number) {
        case 1:
            System.out.println("대출업무입니다.");
            break;
        case 2:
            System.out.println("예금업무입니다.");
            break;
        case 3:
            System.out.println("적금업무입니다.");
            break;
        default:
            System.out.println("잘못된 입력입니다.");
            break;

    }

    if (number == 1) {
        System.out.println("대출업무입니다.");
    } else if (number == 2) {
        System.out.println("예금업무입니다.");
    } else if (number == 3) {
        System.out.println("적금업무입니다.");
    } else if (number == 0) {
        System.out.println("상담사 연결 됩니다.");
    } else {
        System.out.println("잘못된 입력입니다.");
    }


    }
}
