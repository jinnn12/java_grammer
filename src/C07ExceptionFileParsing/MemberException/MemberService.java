//package C07ExceptionFileParsing.MemberException;
//
//import java.awt.*;
//import java.util.NoSuchElementException;
//import java.util.Optional;
//
//// 핵심로직을 구현하는 계층
//// 보통 예외는 Service 계층에서 터짐
//public class MemberService {
//    private MemberRepository memberRepository;
//
//    // 생성자가 호출될 때(회원이 만들어질 때) new로 초기화 시키는 것이 좋은 아키텍쳐
//    public MemberService() {
//        this.memberRepository = new MemberRepository();
//    }
//
//    //    회원가입
//    public void register(String name, String email, String password) {
////        DB에 이메일이 중복일 경우 예외 발생
//        if (memberRepository.findByEmail(email).isPresent()) {
//            throw new IllegalArgumentException("이메일 중복입니다.");
//        }
//
////        객체를 조립 후 Repository에 regiser
//        Member member = new Member(name, email, password);
//        memberRepository.register(member);
//
////        비밀번호가 너무 짧은 경우 예외 발생
//
//
//    }
//
//    //    회원 상세 조회 (optional 조회를 깠는데 isPresent 했는데 없다면 에러 발생 시키기)
////    서비스에서 예외를 터뜨리자
//    public Member findById(Long id) throws NoSuchElementException {
////        Optional 객체에 값이 없을 경우 예외 발생 시키기, 있다면 Member를 꺼내서 return.
//        Optional<Member> optionalMember = memberRepository.findById(id);
//        return memberRepository.findById(id).orElseThrow(() -> NoSuchElementException("아이디가없음"));
//    }
//
//    public Member findByEmail(String email) {
//        if (memberRepository.findByEmail(email).isPresent()) {
//
//        }
//    }
//
////    회원 목록 조회
//    public List<Member> findAll() {
//        return memberRepository.findAll();
//    }
////    Login
//    public void login(String email, String password) throws IllegalArgumentException{
//        Optional<Member> optionalMember = memberRepository.findByEmail(email);
//        if (optionalMember.isPresent()) {
//            throw new NoSuchElementException("이메일을 잘못 입력하셨습니다.");
//        }
//        if (!optionalMember.getPassword().equals(password)) {
//            throw IllegalArgumentException("비밀번호가 틀립니다");
//        }
// {
//        }
//    }
//
//}
