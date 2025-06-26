package ExceptionPractice03;
import java.util.*;

// 사용자으 인터페이스
public class MemberController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();

        while (true) {
            System.out.println("1.회원가입  2.아이디로 회원 조회  3. 이메일로 회원 조회  4.전체 목록 조회  5.로그인");
            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("이름을 입력해주세요.");
                String name = sc.nextLine();
                System.out.println("이메일을 입력해주세요.");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요.");
                String password = sc.nextLine();
                if (password.length() < 4) {
                    System.out.println("비밀번호가 너무 짧습니다.");
                }
                try {
                    memberService.register(name, email, password);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }



            } else if (input.equals("2")) {
                System.out.println("조회할 아이디 입력하세요");
                long id = Long.parseLong(sc.nextLine());

                try {
                    Member member = memberService.findById(id);
                    System.out.println(member);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

            } else if (input.equals("3")) {
                System.out.println("조회할 이메일 입력하세요.");
                String email = sc.nextLine();

                try {
                    Member member = memberService.findByEmail(email);
                    System.out.println(member);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

            } else if (input.equals("4")) {
                System.out.println("전체 목록 조회입니다.");
                for (Member a : memberService.findAll()) {
                    System.out.println(a);
                }

            } else if (input.equals("5")){
                System.out.println("로그인입니다.");
                System.out.println("이메일을 입력해주세요.");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요.");
                String password = sc.nextLine();

                try {
                    memberService.login(email, password);
                    System.out.println("로그인 성공");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }


            }
        }
    }
}
