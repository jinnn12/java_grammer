package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호를 입력하세요");
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber);
//        BankServiceOriginal bs;
//        BankKakaoService bk = new BankKakaoService();
//        BankTossService bt = new BankTossService();
        BankService bs;

        while (true) {
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            String serviceNumber = sc.nextLine();
            if (serviceNumber.equals("1")) {
                System.out.println("입금 서비스입니다.");
                System.out.println("입금방식을 선택해주세요. 1.카카오페이  2.토스페이");
                String selectBank = sc.nextLine();
                if (selectBank.equals("1")) {
                    System.out.println("카카오페이 입금 서비스입니다.");
                    System.out.println("입금하실 금액을 입력해주세요.");
                    Long money = Long.parseLong(sc.nextLine());
                    bs = new BankKakaoService();
                    bs.deposit(money, ba);

                } else if (selectBank.equals("2")){
                    System.out.println("토스페이 입금 서비스입니다.");
                    System.out.println("입금하실 금액을 입력해주세요.");
                    Long money = Long.parseLong(sc.nextLine());
                    bs = new BankTossService();
                    bs.deposit(money, ba);
                }
                System.out.println("입금이 완료 되었습니다.");

            } else if (serviceNumber.equals("2")) {
                System.out.println("출금서비스 입니다.");
                System.out.println("출금방식을 선택해주세요. 1.카카오페이  2.토스페이");
                String selectBank = sc.nextLine();
                    if (selectBank.equals("1")) {
                        System.out.println("카카오페이 출금 서비스입니다.");
                        System.out.println("출금하실 금액을 입력해주세요.");
                        Long money = Long.parseLong(sc.nextLine());
                        BankKakaoService bk = new BankKakaoService();
                        bk.withdraw(money, ba);
                    } else {
                        System.out.println("토스페이 출금 서비스입니다.");
                        System.out.println("출금하실 금액을 입력해주세요.");
                        Long money = Long.parseLong(sc.nextLine());
                        BankTossService bt = new BankTossService();
                        bt.withdraw(money, ba);
                    }
//                System.out.println("출금하실 금액을 입력해주세요.");
//                Long money = Long.parseLong(sc.nextLine());
//                if (bs.withdraw(money, ba)) {
//                    System.out.println("출금이 정상처리되었습니다.");
//                } else {
//                    System.out.println("잔액부족으로 출금불가합니다.");
//                }

            }
        }

    }
}
