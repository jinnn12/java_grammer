package ExceptionPractice02;
import java.util.*;

// 회원 목록 저장 DB
public class MemberRepository {
    List<Member> memberList = new ArrayList<>();

//    회원가입한 것 저장
    public void register(Member member) {
        memberList.add(member);
    }

//    리스트에서 아이디로 회원 조회
    public Optional<Member> findById(long id) {
        return memberList.stream().filter(m -> m.getId() == id).findFirst();
    }

//    리스트에서 이메일로 회원 조회
    public Optional<Member> findByEmail(String email) {
        return memberList.stream().filter(m -> m.getEmail().equals(email)).findFirst();
    }

//    전체회원조회
    public List<Member> findAll() {
        return memberList;
    }
}
