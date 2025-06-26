package ExceptionPractice02;
import java.util.*;

// 핵심로직수행
public class MemberService {
    MemberRepository memberRepository;
    public MemberService () {
        memberRepository = new MemberRepository();
    }
//    회원가입
    public void register(String name, String email, String password) {
//        DB 중복일 경우 예외 발생
        if (memberRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("이메일 중복입니다.");
        }

//        입력 받아서 구성
        Member member = new Member(name, email, password);
        memberRepository.register(member);
    }

//    아이디로 회원 조회
    public Member findById(long id) {
        return memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("아이디가 존재하지 않습니다."));
    }

    //    이메일로 회원 조회
    public Member findByEmail(String email) {
        return memberRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("이메일이 존재하지 않습니다."));
    }

    //    login
    public void login(String email, String password) {
        Optional<Member> memberOptional = memberRepository.findByEmail(email);
        if (!memberOptional.isPresent()) {
            throw new IllegalArgumentException("잘못된 이메일입니다.");
        }
        if (!memberOptional.get().getPassword().equals(password)) {
            throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
        }
    }
//    회원 전체 목록 조회
    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
