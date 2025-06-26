//package C07ExceptionFileParsing.MemberException;
//
//import java.util.NoSuchElementException;
//import java.util.Scanner;
//
//// 사용자의 입출력을 받아 처리하는 계층 (interaction, interface), 4번 로그인 서비스도 만들어보기
//public class MemberController {
//    public static void main(String[] args) {
//        MemberService memberService = new MemberService();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("1번 : 회원가입, 2번 : 회원상세조회, 3번 : 회원목록조회");
//            String input = sc.nextLine();
//            if (input.equals("1")) {
////                이름, 이메일, 패스워드 입력 받아서 service에 전달 후 회원 가입 (객체조립은 서비스에서 !)
//                System.out.println("회원가입 서비스입니다");
//                System.out.println("이름을 입력해주세요.");
//                String name = sc.nextLine();
//                System.out.println("이메일을 입력해주세요.");
//                String email = sc.nextLine();
//                System.out.println("비밀번호를 입력해주세요.");
//                String password = sc.nextLine();
//                if (password.length() < 8) {
////                    throw new IllegalArgumentException("비번이 너무 짧습니다.");
//                    System.out.println("비번이 너무 짧습니다.");
////                    continue;
//                }
//                try {
//                    memberService.register(name, email, password);
//                } catch (IllegalArgumentException e) {
//                    System.out.println(e.getMessage()); // service에서 넘겨오는 메세지가 여기 담겨 있다
//                }
//
////                예외 발생 시 적절한 문구 사용자에게 출력 (try catch gogo)
//
//
//            } else if (input.equals("2")) {
////                사용자에게 회원 정보 출력
//                System.out.println("회원 상세 조회입니다.");
//                System.out.println("찾고자 하는 회원의 아이디를 입력하세요.");
//                long id = Long.parseLong(sc.nextLine()); //이미 안다고 전제하에..
//
//                try {
//                    Member member = memberService.findById(id);
//                    System.out.println(member);
//
//                } catch (NoSuchElementException e) {
//                    System.out.println(e.getMessage());
//                }
//                memberService.findById(id);
//
////                적절한 예외처리 필요
//
//
//            } else if (input.equals("3")) {
////                회원 목록 정보 출력
//                System.out.println("회원 목록 조회입니다.");
//                for (Member m : memberService.findAll()) {
//                    System.out.println(m);
//                }
//            } else if (input.equals("4")) {
//                String email = sc.nextLine();
//                String password = sc.nextLine();
//                try {
//                    memberService.login(String, email, String, password);
//                    System.out.println("로그인성공");
//                } catch (IllegalArgumentException e) {
//                    System.out.println(e.getMessage());
//                }
//
//            }
//        }
//
//    }
//}
