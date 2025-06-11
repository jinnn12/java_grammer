package C01Basic;

public class C03Operator {
    public static void main(String[] args) {
////        산술연산자 : 사칙연산
//        int n1 = 8;
//        int n2 = 3;
////        *:곱셈, /:나눗셈(몫), %:나머지
//        System.out.println("n1 * n2 = " + (n1*n2));
//        System.out.println("n1 / n2 = " + (n1/n2));
//        System.out.println("n1 % n2 = " + (n1%n2));

////        대입연산자
//        int n1 = 7;
//        int n2 = 7;
//        int n3 = 7;
//        n1 = n1 - 3;
//        n2 -= 3;
//        n3 = -3;
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//
//        int n4 = 10;
//        int n5 = 10;
//        n4 /= 3;
//        n5 %= 3;
//        System.out.println(n4);
//        System.out.println(n5);

////        증감연산자
//        int a = 10;
//        a = a + 1;
//        System.out.println(a); //11
//        a += 1;
//        System.out.println(a); //12
//        a++;
//        System.out.println(a); //13
//        ++a;
//        System.out.println(a); //14

////        a++ : 현재 라인의 명령문이 실행 되고 나서 증가
////        ++a : 현재 라인의 명령문이 실행 되기 전에 증가
//
//        int b = 5;
//        int c = b++; // c:5, b:6이 되고 나서 뒤에 계산
//        int d = ++b; // d:7
//        System.out.println(c);
//        System.out.println(d);
//
////        비교연산자 : ==, !=, >, >= 등
//        char ch1 = 'a';
//        char ch2 = 'b';
//        System.out.println(ch1==ch2);
//        System.out.println(ch1!=ch2);

//        논리연산자 : &&, ||, !
        int num1 = 10;
        int num2 = 20;
        boolean b1 = 5 < num1 && num1 < 20;
        System.out.println(b1);

//        num2 = 10과 30사이에 있는지 여부를 b2에 값 세팅
        boolean b2 = 10 <= num2 && num2 < 30;
        boolean b3 = !(num2 < 10 || num2 >= 30);

//        비트연산자 : 컴퓨터의 2진체계에서의 연산방식, & | ^ << >>
        int n1 = 5;
        int n2 = 4;
        System.out.println(n1 & n2); //이진 표현 했을 때 각 수의 이진 표현에서 두 수 비교시에 각 자리 수 모두 1이 있어야 1 출력.
        System.out.println(n1 | n2);

//        왼쪽으로 1칸 옮긴다는 의미는 해당 숫자값에 *2
//        오른쪽으로 1칸 옮긴다는 의미는 해당 숫자값에 /2

    }

}
