package ExceptionPractice02;
import java.util.*;

public class MemberController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();
        while (true) {
            System.out.println("1회원가입 2아이디로회원조회 3이메일로회원조회 4회원전체조회 5로그인");
            String input = sc.nextLine();
                if (input.equals("1")) {
                    System.out.println("회원가입");
                    System.out.println("이름을 입력");
                    String name = sc.nextLine();
                    System.out.println("이메일을 입력");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력");
                    String password = sc.nextLine();

                    try {
                        memberService.register(name, email, password);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                } else if (input.equals("2")) {
                    System.out.println("조회하고자 하는 아이디 입력");
                    long id = Long.parseLong(sc.nextLine());

                    try {
                        Member member = memberService.findById(id);
                        System.out.println(member);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                } else if (input.equals("3")) {
                    System.out.println("조회하고자하는 이메일 입력");
                    String email = sc.nextLine();

                    try {
                        Member member = memberService.findByEmail(email);
                        System.out.println(member);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                } else if (input.equals("4")) {
                    for (Member a : memberService.findAll()) {
                        System.out.println(a);
                    }

                } else if (input.equals("5")) {
                    System.out.println("로그인입니다");
                    System.out.println("이메일입력하세요");
                    String email = sc.nextLine();
                    System.out.println("비번입력하세요.");
                    String password = sc.nextLine();

                    try {
                        memberService.login(email, password);
                        System.out.println("login success");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }

    }

