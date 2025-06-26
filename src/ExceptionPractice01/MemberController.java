package ExceptionPractice01;

import java.util.NoSuchElementException;
import java.util.Scanner;
// 1.회원가입  2.회원상세조회  3.회원목록조회  4.로그인
//1.이름, 이메일, 패스워드 -> service에 전달 후 회원가입 (예외 발생 시 사용자에게 적절한 문구 출력)
//2.회원정보 출력
//3.회원목록정보 출력
//4.로그인
//사용자의 입력을 받아 처리하는 계층

public class MemberController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService ms = new MemberService();
        while (true) {
            System.out.println("1.회원가입  2.회원상세조회  3.회원목록조회  4.로그인");
            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("회원가입");
                System.out.println("이름입력해주세요");
                String name = sc.nextLine();
                System.out.println("이메일 입력");
                String email = sc.nextLine();
                System.out.println("비밀번호 입력");
                String password = sc.nextLine();
                if (password.length() < 4) {
                    System.out.println("비밀번호가 짧습니다.");
                }
                try {
                    ms.register(name, email, password);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (input.equals("2")) {
                System.out.println("회원상세조회입니다.");
                System.out.println("조회하실 아이디를 입력하세요.");
                long id = Long.parseLong(sc.nextLine());
                try {
                    Member member = ms.findById(id);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (input.equals("3")) {
                System.out.println("회원목록조회입니다.");
                for (Member m : ms.findAll()) {
                    System.out.println(m);
                }
            } else if (input.equals("4")) {
                System.out.println("로그인");
                System.out.println("이메일 입력");
                String email = sc.nextLine();
                System.out.println("비번입력");
                String password = sc.nextLine();
                try {
                    ms.login(email, password);
                    System.out.println("login success");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());

                }
            }
        }
    }
}
