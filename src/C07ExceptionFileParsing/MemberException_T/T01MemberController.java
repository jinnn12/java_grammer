//package C07ExceptionFileParsing.MemberException_T;
//
//import java.util.NoSuchElementException;
//import java.util.Scanner;
//
////사용자의 입출력을 받아 처리하는 계층
//public class T01gMemberController {
//    public static void main(String[] args) {
//        T01MemberService memberService = new T01MemberService();
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.println("1번 : 회원가입, 2번 : 회원상세조회, 3번 : 회원목록조회, 4번 : 로그인" );
//            String input = sc.nextLine();
//            if (input.equals("1")){
////                이름, 이메일, 패스워드 입력받아서 service에 전달해서 회원가입
//                String name = sc.nextLine();
//                String email = sc.nextLine();
//                String password = sc.nextLine();
//                if(password.length()<8){
//                    System.out.println("비밀번호가 너무 짧습니다.");
//                }
//                try {
//                    memberService.register(name, email, password);
//                }catch (IllegalArgumentException e){
//                    System.out.println(e.getMessage());
//                }
////                예외발생시 적절한 문구를 사용자에게 출력.
//
//            }else if (input.equals("2")){
////                회원정보 출력
//                long id = Long.parseLong(sc.nextLine());
//                try {
//                    T01Member member = memberService.findById(id);
//                    System.out.println(member);
//                }catch (NoSuchElementException e){
//                    System.out.println(e.getMessage());
//                }
////                적절한 예외처리 필요
//            }else if(input.equals("3")){
////                회원목록정보 출력
//                for (T01Member m : memberService.findAll()){
//                    System.out.println(m);
//                }
//            }else if(input.equals("4")){
//                String email = sc.nextLine();
//                String password = sc.nextLine();
//                try {
//                    memberService.login(email, password);
//                    System.out.println("로그인 성공입니다.");
//                }catch (IllegalArgumentException e){
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//    }
//}
