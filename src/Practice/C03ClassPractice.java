package Practice;

public class C03ClassPractice {
    public static void main(String[] args) {
////        A회사의 매출
////        20원 매출 발생
//        System.out.println(MyCalculator.sumAcc(20));
        MyCalculatorInstance A = new MyCalculatorInstance();
        A.sumAcc(20);
////        30원 매출 발생
//        System.out.println(MyCalculator.sumAcc(30));
        A.sumAcc(30);
//
////        40원 매출 발생
//        System.out.println(MyCalculator.sumAcc(40)); // 90원
        A.sumAcc(40);
//
////        B회사의 매출
////        10원 매출 발생
//        System.out.println(MyCalculator.sumAcc(10)); // 100원
        MyCalculatorInstance B = new MyCalculatorInstance();
        B.sumAcc(10);

////        20원 매출 발생
        B.sumAcc(20);



    }
}

class MyCalculator {
    static int total = 0;
    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sumAcc(int a) {
        total += a;
        return total;
    }
}

class MyCalculatorInstance {
    int total = 0;
    public static int sum(int a, int b) {
        return a + b;
    }

    public void sumAcc(int total) {
        this.total += total;
        System.out.println(this.total);
    }


}
