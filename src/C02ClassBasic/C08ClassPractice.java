package C02ClassBasic;
import java.util.*;

public class C08ClassPractice {
    public static void main(String[] args) {
//        객체선언 및 List에 2개 add
        List<Account> myList = new ArrayList<>();
//        계좌 개설이 2개 이미 된 상황
        Account a = new Account("kim", "01234", 100000);
        Account b = new Account("kim2", "54321", 200000);
        myList.add(a);
        myList.add(b);
        System.out.println(a);


//        계좌번호 목록 조회
        for (Account s : myList) {
            System.out.println(a.getAccountNumber());
        }

//        사용자1이 사용자2에게 송금
            for (Account t : myList) { //여기서 t는 주소값임 / Account는 원시자료형이 아니잖아
                if (a.getAccountNumber().equals("01234")) {
                    a.setBalance(a.getBalance() - 50000);
                }
                if (a.getAccountNumber().equals("54321")) { // 54321의 객체를 찾아서 +50000
                    a.setBalance(a.getBalance() + 50000);
                }
                System.out.println(t);
            }


//            계좌 상세 조회 : 계좌 번호, 잔고 조회
            for (Account ss : myList) {
                System.out.println("계좌번호 : " + a.getAccountNumber() + " 잔고 : " + a.getBalance());
            }

//            Map을 자료구조로 사용
            Map<String, Account> accountMap = new HashMap<>();

            accountMap.put("12345", new Account("KIM", "12345", 100000));
            accountMap.put("54321", new Account("KIM2", "54321", 100000));

////            송금
//            Account a = accountMap.get("12345");
//            Account b = accountMap.get("12345");
//            a.setBalance(a.getBalance()-50000);
//            b.setBalance(b.getBalance()-50000);

//            계좌번호 조회
            for(String ac : accountMap.keySet()) {
                System.out.println(accountMap.get(ac).getAccountNumber());
            }

        }
    }


// Account 클래스. 계좌주명(name-String), 계좌번호(accountNumber-String), 잔고(balance-long)

class Account {
    private String name;
    private String accountNumber;
    private long balance;

    public Account(String name, String number, int balance) {
    }


    public Account (String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + this.name +
                ", accountNumber='" + this.accountNumber +
                ", balance=" + this.balance +
                '}';
    }
}
