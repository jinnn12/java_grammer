//package C02ClassBasic;
//import java.util.*;
//
//public class C08ClassPractice {
//    public static void main(String[] args) {
////        객체선언 및 List에 2개 add
//        List<Account> myList = new ArrayList<>();
//        Account a1 = new Account("kim", "01234", 100000);
//        Account a2 = new Account("kim", "01234", 100000);
//        myList.add(a1);
//        myList.add(a2);
//    }
//}
//
//// Account 클래스. 계좌주명(name-String), 계좌번호(accountNumber-String), 잔고(balance-long)
//
//class Account {
//    private String name;
//    private String accountNumber;
//    private long balance;
//
//    public void Account (String name, String accountNumber, long balance) {
//        this.name = name;
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//    public long getBalance() {
//        return balance;
//    }
//
//    @Override
//    public String toString() {
//        return "Account{" +
//                "name='" + name +
//                ", accountNumber='" + accountNumber +
//                ", balance=" + balance +
//                '}';
//    }
//}
