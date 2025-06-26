package ExceptionPractice01;

import java.util.*;

//저장소역할을 하는 계층
//DB에 CRUD를 수행하는 계층
public class MemberRepository {
    List<Member> memberList = new ArrayList<>();

    //    회원가입
    public void register(Member member) {
        memberList.add(member);
    }
//    이메일로 회원 조회
    public Optional<Member> findByEmail(String email) {
        return memberList.stream().filter(m -> m.getEmail().equals(email)).findFirst();
    }

//    아이디로 회원 조회
    public Optional<Member> findById(long id) {
        return memberList.stream().filter(m -> m.getId() == id).findFirst();
    }

//    회원 전체 목록 조회
    public List<Member> findAll() {
        return memberList;
    }


}
