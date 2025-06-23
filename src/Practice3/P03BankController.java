package Practice3;

import java.util.*;
public class P03BankController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호를 입력하세요.");
        String accountNumber = sc.nextLine();
        P03BankAccount ba = new P03BankAccount(accountNumber); //계좌번호를 매개변수로 받는 P03BankAccount ba 생성
        P03BankService bs;


        while (true) {

            System.out.println("원하시는 서비스를 입력하세요.");
            System.out.println("1.입금 서비스  2.출금 서비스");
            String serviceNumber = sc.nextLine();

            if (serviceNumber.equals("1")) {
                System.out.println("입금 서비스 입니다.");
                System.out.println("사용하고자 하는 은행을 입력해주세요.");
                System.out.println("1.카카오뱅크  2.토스뱅크");
                String selectBank = sc.nextLine();
                if (selectBank.equals("1")) {
                    System.out.println("카카오뱅크 입금서비스 입니다.");
                    System.out.println("입금 금액을 입력해주세요.");
                    long money = Long.parseLong(sc.nextLine());
                    bs = new P03BankKakaoService();
                    bs.deposit(money, ba);
                    System.out.println("'카카오뱅크' " + money + "원 입금 완료되었습니다.");
                    System.out.println("'카카오뱅크' 현재 잔액 : " + ba.getBalance());

                } else if (selectBank.equals("2")) {
                    System.out.println("토스뱅크 입금서비스 입니다.");
                    System.out.println("입금 금액을 입력해주세요.");
                    long money = Long.parseLong(sc.nextLine());
                    bs = new P03BankTossService();
                    bs.deposit(money, ba);
                    System.out.println("'토스뱅크' " + money + "원 입금 완료되었습니다.");
                    System.out.println("'토스뱅크' 현재 잔액 : " + ba.getBalance());
                }

            } else if (serviceNumber.equals("2")) {
                System.out.println("출금 서비스 입니다.");
                System.out.println("사용하고자 하는 은행을 입력해주세요.");
                System.out.println("1.카카오뱅크  2.토스뱅크");
                String selectBank = sc.nextLine();

                if (selectBank.equals("1")) {
                    System.out.println("카카오뱅크 출금서비스 입니다.");
                    System.out.println("출금 금액을 입력해주세요.");
                    long money = Long.parseLong(sc.nextLine());
                    bs = new P03BankKakaoService();
                    boolean check = bs.withdraw(money, ba);
                    if (check) {
                        System.out.println("'카카오뱅크' " + money + "원 출금 완료되었습니다.");
                    } else {
                        System.out.println("'카카오뱅크' 잔액이 부족합니다.");
                    }
                    System.out.println("'카카오뱅크' 현재 잔액 : " + ba.getBalance());

                } else if (selectBank.equals("2")) {
                    System.out.println("토스뱅크 출금서비스 입니다.");
                    System.out.println("출금 금액을 입력해주세요.");
                    long money = Long.parseLong(sc.nextLine());
                    bs = new P03BankTossService();
                    boolean check = bs.withdraw(money, ba);
                    if (check) {
                        System.out.println("'토스뱅크'" + money + "원 출금 완료되었습니다.");

                    } else {
                        System.out.println("'토스뱅크' 잔액이 부족합니다." );
                    }
                    System.out.println("'토스뱅크' 현재 잔액 : " + ba.getBalance());
                }

            }


        }

    }
}
