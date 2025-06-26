package ExceptionPractice01;

import java.util.*;

//핵심로직 구현 계층
public class MemberService {
    MemberRepository memberRepository;
    public MemberService() {
        this.memberRepository = new MemberRepository();
    }
//    회원가입
    public void register(String name, String email, String password) {
//        DB에 이메일 중복일 경우 예외 발생
        if (memberRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("이메일 중복입니다.");
        }
//        객체를 조립후 repository에 register
        Member member = new Member(name, email, password);
        memberRepository.register(member);
    }

//    아이디로 회원 조회
    public Member findById(long id) {
        return memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("아이디가 없습니다."));
    }

//    이메일로 회원 조회
    public Member FindByEmail(String email) {
        return memberRepository.findByEmail(email).orElseThrow(() -> new NoSuchElementException("이메일 없습니다."));
    }

//    회원 전체 목록 조회
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    //    login
    public void login(String email, String password) {
        Optional<Member> optionalMember = memberRepository.findByEmail(email);
        if (!optionalMember.isPresent()) {
            throw new IllegalArgumentException("잘못된 이메일입니다.");
        }
        if (!optionalMember.get().getPassword().equals(password)) {
            throw new IllegalArgumentException("비밀번호가 잘못됐다");
        }
    }





}
