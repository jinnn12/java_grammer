package Practice.C04Interface.BankService;

import java.util.*;

// 사용자 인터페이스
public class BankController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호를 입력하세요.");
        String accountNumber = sc.nextLine();

        BankAccount ba = new BankAccount(accountNumber);
        BankServiceOriginal bs = new BankServiceOriginal();

        while (true) {
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            String bankService = sc.nextLine();

            if (bankService.equals("1")) {
                System.out.println("입금 서비스입니다.");
                System.out.println("입금하실 금액을 입력해주세요.");
                long money = Long.parseLong(sc.nextLine());
                bs.deposit(money, ba);

            } else {
                System.out.println("출금 서비스입니다.");
                System.out.println("출금하실 금액을 입력해주세요.");
                long money = Long.parseLong(sc.nextLine());

                boolean success = bs.withdraw(money, ba);
                if (success) {
                    System.out.println("출금이 완료되었습니다.");
                } else {
                    System.out.println("출금금액이 부족합니다.");
                }
            }
        }









//        while (true) {
//            System.out.println("입금하시려면 1번, 출금하시려면 2번");
//            String serviceNumber = sc.nextLine();
//            if (serviceNumber.equals("1")) {
//                System.out.println("입금 서비스입니다.");
//                System.out.println("입금방식을 선택해주세요.");
//                String selectBank = sc.nextLine();
//                System.out.println("1.카카오페이  2.토스페이");
//
//                if (selectBank.equals("1")) {
//                    System.out.println("카카오페이 입금서비스 입니다.");
//                    System.out.println("입금하실 금액을 입력해주세요.");
//                    Long money = Long.parseLong(sc.nextLine());
//
//                } else if (selectBank.equals("2")) {
//                    System.out.println("토스페이 입금서비스 입니다.");
//                    System.out.println("입금하실 금액을 입력해주세요.");
//                    Long money = Long.parseLong(sc.nextLine());
//
//                }
//
//            } else if (serviceNumber.equals("2")) {
//
//            }
//
//        }

    }
}
