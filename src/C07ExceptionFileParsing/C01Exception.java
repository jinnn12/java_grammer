package C07ExceptionFileParsing;

import java.sql.SQLException;
import java.util.Scanner;

public class C01Exception {
    public static void main(String[] args) {
////        일반적인 예외처리 방식 : 예외가 발생 시 프로그램이 중지되지 않도록 하는 프로그래밍
//        System.out.println("나눗셈 프로그램 입니다.");
//        Scanner sc = new Scanner(System.in);
////        예외처리 : 예외가 발생할 것으로 예상되는 코드를 try로 감싼다
//        try {
//            System.out.println("분자를 입력해주세요.");
//            int head = Integer.parseInt(sc.nextLine());
//
//            System.out.println("분모를 입력해주세요.");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head / tail; //여기서 예외 발생시 try 내부의 하단의 코드는 실행되지 않음.
//            System.out.println("두 수를 나눈 결괏값은 : " + result);
//
////            catch를 통해 예상되는 예외클래스를 분기처리 한다. 예외가 터지면 catch 안으로 들어옴 (catch 하나씩 찾아봄, 택1)
//
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나누시면 안됩니다!");
////            아래와 같은 방식으로 시스템 로그를 기록.
//            e.printStackTrace(); // 빨강색으로 존나뜨는건 나한테 보여주는거, 기록용
//            System.out.println(e.getMessage()); // 메세지만 간략히 출력하는 경우에 사용
//            //  try - catch로 묶음해줌으로써 프로그램이 종료가 되지 않음
//
//        } catch (NumberFormatException e) {
//            System.out.println("문자를 입력하시면 안됩니다.");
//            e.printStackTrace();
////            Exception은 모든 예외의 조상 클래스
//
//        } catch (Exception e) {
//            System.out.println("예상치 못한 에러가 발생했습니다.");
//            e.printStackTrace();
//
//        } finally {
////            예외가 발생하든 말든 무조건 실행되는 구문
//            System.out.println("무조건 실행되는 문구입니다.");
//        }
////        왜 이렇게까지 catch 분기처리를 하는가? -> 사용자에게 명확한 메세지를 주기 위해
//        System.out.println("hello world");

//        의도된 예외 강제 발생 : 특정 시점에 프로그램을 강제 중지.
//        프로그램을 통해 DB에 저장해야되는데, 강제로 예외를 발생해야 하는 이유 ? ?
        System.out.println("로그인을 위한 비밀번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        login(input);

//       checkedException의 경우에는 예외처리를 위임받게 되면 반드시 예외처리를 하거나 다시 throws를 해야 함. . .
//        checked 를 try - catch 해서 unchecked를 throw를 해야 함 _> rollback을 위해?
        try {
            login2(input);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("환영합니다.");
    }

//    throws 키워드를 통해 예외를 위임한다.
//    다만, unchecked 예외에서는 예외처리가 강제가 아니므로, throws가 큰 의미는 없다.
//    그러나 checked 예외에서는 예외처리가 강제되므로, throws가 의미가 있음.

//    throws IllegalArgumentException : 안 써도 되는데 명시적으로 써줘야 함.
// 핵심 로직만 수행하는 메서드 : service 계층 , 인터페이스 : controller 계층, 상태관리 : entity


    static boolean login(String password) throws IllegalArgumentException {
        if (password.equals("1234")) {
            return true;
        } else {
//            예외를 강제발생시킴으로써 이 시점에서 해당 메서드 강제 종료 (클래스가 종료되는 건 아님!!)
//            예외는 호출한 메서드로 반환됨
//            -> 예외는 기본적으로 해당 메서드를 호출한 곳으로 전파된다.
            throw new IllegalArgumentException("비밀번호를 잘못 입력하였습니다.");
//            return false; //의미가 없어짐
        }
    }

    static boolean login2(String password) throws Exception{
        if (password.equals("1234")) {
            return true;
        } else {
//            checkedException은 예외처리가 강제된다.
//            해당메서드 내에서 예외처리를 하든, 명시적으로 throws를 통해 호출 메서드에 위임(호출메서드에서 try catch)을 하든 예외처리를 해야함.
                throw new SQLException("비밀번호를 잘못 입력하였습니다.");
//            return false; //의미가 없어짐


        }
    }
}
