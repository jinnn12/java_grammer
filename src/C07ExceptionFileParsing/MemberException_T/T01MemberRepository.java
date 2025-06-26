package C07ExceptionFileParsing.MemberException_T;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//저장소역할을 하는 계층
//DB에 CRUD를 수행하는 계층
public class T01MemberRepository {
    private static List<T01Member> memberList = new ArrayList<>();
    //    회원가입
    public void register(T01Member member){
        memberList.add(member);
    }

    public Optional<T01Member> findByEmail(String email){
        return memberList.stream().filter(m->m.getEmail().equals(email)).findFirst();
    }
    //    회원상세조회
    public Optional<T01Member> findById(Long id){
        return memberList.stream().filter(m->m.getId()==id).findFirst();
    }

    //    회원목록조회
    public List<T01Member> findAll(){
        return memberList;
    }
}
