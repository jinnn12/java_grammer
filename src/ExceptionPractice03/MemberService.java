package ExceptionPractice03;

import java.util.*;
// 핵심 로직 수행 -> DB로 저장해야 함 (Repository로)
public class MemberService {
    MemberRepository memberRepository;
    public MemberService() {
        memberRepository = new MemberRepository();
    }

    //    회원 가입
    public void register(String name, String email, String password) {
//        Repository에서 중복되는 이메일이 있냐 예외처리
        if (memberRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("이메일이 중복입니다.");
        }

//        여기서 조립해서 Repository로 전달
        Member member = new Member(name, email, password);
        memberRepository.register(member);

    }

    //    아이디로 회원 상세조회
    public Member findById(long id) {
        return memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("조회하고자 하는 아이디가 없습니다."));
    }

//    이메일로 회원 상세 조회
    public Member findByEmail(String email) {
        return memberRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("조회하고자 하는 이메일이 없습니다."));
    }

    //    로그인
    public void login(String email, String password) {
//        이메일이 틀렸나
        Optional<Member> optionalMember = memberRepository.findByEmail(email);
        if (!optionalMember.isPresent()) {
            throw new IllegalArgumentException("이메일이 틀렸습니다.");
        }
        if (!optionalMember.get().getPassword().equals(password)) {
            throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
        }

//        비밀번호가 틀렸나
    }

//    전체목록
    public List<Member> findAll() {
        return memberRepository.findAll();
    }



}
