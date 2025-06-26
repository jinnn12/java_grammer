package C07ExceptionFileParsing.MemberException;
import java.util.*;

// 저장소역할을 하는 계층
// DB에 CRUD를 수행하는 계층 (조회)
// 각각의 코드에 역할분리를 해보자 (계층 분리를 해보자 -> 유지보수의 편리함)

// 엔티티
public class MemberRepository {
    // 이 부분이 static 이어도 되는지 안되는지 이해하기
    // 코드가 실행될 때 바로 메모리에 올라갈 때부터 초기화
    private static List<Member> memberList = new ArrayList<>();

    //    회원가입
    public void register(Member member) {
        memberList.add(member);
    }

    //    회원 상세 조회 (회원이 있을수도 없을수도 있으므로 Optional)

    public Optional<Member> findById(Long id) {
        return memberList.stream().filter(m -> m.getId() == id).findFirst();

//        Member member= null;
//        for (Member m : memberList) {
//            if (m.getId() == id) {
//
//            }
//        }

//        Optional<Member> findMember = Optional.empty();
//        for (Member d : memberList) {
//            if (d.getId().equals(id)) {
//                findMember = Optional.of(d);
//            }
//        }
//        return findMember;

    }

    public Optional<Member> findByEmail(String email) {
        return memberList.stream().filter(m -> m.getEmail().equals(email)).findFirst();

//        Optional<Member> findMember = Optional.empty();
//        for (Member m : memberList) {
//            if (m.getEmail().equals(email)) {
//                findMember = Optional.of(m);
//            }
//        }
//        return findMember;
    }

//    회원 목록 조회
    public List<Member> findAll() {
        return memberList;
//        return new ArrayList<>(memberList); // 원본 변경의 여지가 없다 / 그 논리로면 다른 친구들도 new Member(...) 처럼 해야 함
    }


}
