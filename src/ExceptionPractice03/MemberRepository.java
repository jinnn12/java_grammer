package ExceptionPractice03;
import java.util.*;

// DB, CRUD 하는 역할
public class MemberRepository {
    List<Member> memberList = new ArrayList<>();

    //    회원가입 회원 정보 저장
    public void register(Member member) {
        memberList.add(member);
    }

    //    리스트에 있는 아이디로 회원 조회 (없을수도 있고 있을수도 있으니 Optional 객체로 생성)
    public Optional<Member> findById(long id) {
        return memberList.stream().filter(m -> m.getId() == id).findFirst();
    }

    //    리스트에 있는 이메일로 회원 조회
    public Optional<Member> findByEmail(String email) {
        return memberList.stream().filter(m -> m.getEmail().equals(email)).findFirst();
    }

//    회원 전체 목록 조회
    public List<Member> findAll() {
        return memberList;
    }



}
