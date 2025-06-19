package C02ClassBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//        계좌개설 및 입출금 서비스 : id(auto_increment), name(String), accountNumber(String), balance(long).
//        주의사항1 : main메서드에서 입출력 처리를 하고, deposit(예금) , withdraw(출금), transfer(송금) 메서드는 BankAccount클래스에 생성.
//        주의사항2 : 프로그램은 항상 실행될 수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.계좌개설 : 계좌번호와 현재가지고 계신 돈을 입력하세요. -> 자동으로 id값 증가되어 세팅
//        2.계좌조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요. -> 현재 계좌에 얼마가 있습니다. 현재 계좌 잔액 출력.
//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증) -> "남은 금액은 얼마입니다." 또는 "잔액이 부족합니다." 출력.
//        5.송금 : 송금서비스입니다. 본인의 계좌번호를 입력해주세요. 보내고자 하는 상대방의 계좌번호를 입력해주세요. 송금금액을 입력해주세요.(잔액검증 : 남은 금액은 얼마입니다, 잔액이 부족합니다.)
public class C09BankService {
    public static void main(String[] args) {
//        자료구조 : BankAccount 객체를 담아둘 자료구조 선언
        Map<String, BankAccount> account = new HashMap<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("원하시는 서비스 번호를 입력하세요");
            String input = sc.nextLine();
            if (input.equals("1")) { //계좌 개설

                System.out.println("이름을 입력해주세요.");
                String name = sc.nextLine();

                System.out.println("계좌번호를 입력해주세요.");
                String accountNumber = sc.nextLine();

                System.out.println("잔고를 입력해주세요.");
                String balanceSt = sc.nextLine();
                long balance = Long.parseLong(balanceSt);

                BankAccount ba = new BankAccount(name, accountNumber, balance);
                account.put(ba.getAccountNumber(), ba); //계좌번호, 객체
                System.out.println(account.get(ba.getAccountNumber()));

            } else if (input.equals("2")) {
                System.out.println("계좌 조회 서비스입니다.");
                System.out.println("계좌 번호를 입력해주세요.");
                String accountNumber = sc.nextLine();
                BankAccount ba = account.get(accountNumber);
                System.out.println(accountNumber + "의 잔액은 : " + ba.getBalance());
                System.out.println(ba.getBalance());

            } else if (input.equals("3")) {
                System.out.println("계좌 입금 서비스입니다.");
                System.out.println("입금하실 계좌 번호를 입력해주세요");

                String accountNumber = sc.nextLine();


                System.out.println("입금 금액을 입력해 주세요");
                long money = Long.parseLong(sc.nextLine());
//                내 객체 찾기
                BankAccount ba = account.get(accountNumber);

                System.out.println("+" + ba.getBalance());
                ba.deposit(money);
                System.out.println(ba.getBalance());

            } else if (input.equals("4")) {
                System.out.println("출금 서비스입니다.");
                System.out.println("계좌 번호를 입력해주세요.");
                String accountNumber = sc.nextLine();

                System.out.println("출금 금액을 입력해주세요.");
                long money = Long.parseLong(sc.nextLine());

                BankAccount ba = account.get(accountNumber);

                System.out.println("-" + ba.getBalance());
                ba.withdraw(money); // balance < money, return false 했는데 안 멈춰짐..?
                System.out.println(ba.getBalance());

            } else if (input.equals("5")) {
                System.out.println("송금 서비스입니다.");
                System.out.println("계좌 번호를 입력해주세요.");
                String accountNumber = sc.nextLine();

                System.out.println("송금 상대의 계좌번호를 입력하세요.");
                String targetAccount = sc.nextLine();
                BankAccount ta = account.get(targetAccount);
                BankAccount ba = account.get(accountNumber);


                System.out.println("송금 금액을 입력해주세요.");
                long money = Long.parseLong(sc.nextLine());
                if (ba.transfer(ta, money)) {
                    System.out.println(ta + "로 송금이 완료되었습니다. 현재 잔액 : " + ba.getBalance() );
                }
                else {
                    System.out.println("잔액 부족");
                }

            }

        }
    }
}

class BankAccount {
//    static int id_count = 0;
//
//    private int id;
    private String name;
    private String accountNumber;
    private long balance;

    ///    생성자
    public BankAccount(String name, String accountNumber, long balance){
//        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public BankAccount(String accountNumber, long balance){
//        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    ///    getter 생성
//    public int getId() {
//        return id;
//    }
    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public long getBalance() {
        return balance;
    }

    ///    의도를 명확히 한 메서드 생성 (deposit, withdraw, transfer)
//    public BankAccount() { // 생성 시 id_count ++
//        id_count++;
//    }
    public void deposit(long money){
        this.balance += money;
    }

    public boolean withdraw(long money) {
        if (this.balance > money) {
            this.balance -= money;
            return true;    //        잔고가 있다면 차감 후 true 리턴
        } else {
            return false;   // 잔고가 없다면 false 리턴
        }
    }

    ///매개변수로 BankAccount 또는 String의 accountNumber 둘 다 가능
    public boolean transfer(BankAccount targetAccount, long money){
        if (this.balance > money) {
            this.balance -= money;
            targetAccount.deposit(money);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}




