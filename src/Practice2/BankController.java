package Practice2;

import java.util.*;
public class BankController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호를 입력하세요.");
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber);
        BankService bs;


        while (true) {
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            String serviceNumber = sc.nextLine();
            if (serviceNumber.equals("1")) {
                System.out.println("입금 서비스입니다.");
                System.out.println("입금방식을 선택해주세요. 1.카카오뱅크  2.토스뱅크");
                String selectBank = sc.nextLine();
                if (selectBank.equals("1")) {
                    System.out.println("카카오뱅크 입금 서비스입니다.");
                    System.out.println("입금하실 금액을 입력해주세요.");
                    long money = Long.parseLong(sc.nextLine());
                    bs = new BankKakaoService();
                    bs.deposit(money, ba);

                } else if (selectBank.equals("2")) {
                    System.out.println("토스뱅크 입금 서비스입니다.");
                    System.out.println("입금하실 금액을 입력해주세요.");
                    long money = Long.parseLong(sc.nextLine());
                    bs = new BankTossService();
                    bs.deposit(money, ba);
                }
                System.out.println("입금이 완료되었습니다.");

            } else if (serviceNumber.equals("2")) {
                System.out.println("출금 서비스입니다.");
                System.out.println("출금방식을 선택해주세요. 1.카카오뱅크  2.토스뱅크");
                String selectBank = sc.nextLine();
                if (selectBank.equals("1")) {
                    System.out.println("카카오뱅크 출금서비스입니다.");
                    System.out.println("출금하실 금액을 입력하세요.");
                    long money = Long.parseLong(sc.nextLine());
                    bs = new BankKakaoService();
                    boolean check = bs.withdraw(money, ba);
                    if (check) {
                        System.out.println("출금 성공");
                    } else {
                        System.out.println("금액 부족, 출금 실패!");
                    }


                } else if (selectBank.equals("2")) {
                    System.out.println("토스뱅크 출금서비스입니다.");
                    System.out.println("출금하실 금액을 입력해주세요.");
                    long money = Long.parseLong(sc.nextLine());
                    bs = new BankTossService();
                    boolean check = bs.withdraw(money, ba);
                    if (check) {
                        System.out.println("출금 성공");
                    } else {
                        System.out.println("금액 부족, 출금 실패!");
                    }
                }
            }

        }
    }
}
