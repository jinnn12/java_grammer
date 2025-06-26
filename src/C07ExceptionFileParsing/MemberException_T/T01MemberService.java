package C07ExceptionFileParsing.MemberException_T;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//핵심로직을 구현하는 계층
public class T01MemberService {
    private T01MemberRepository memberRepository;
    public T01MemberService(){
        this.memberRepository = new T01MemberRepository();
    }

    //    회원가입
    public void register(String name, String email, String password) throws IllegalArgumentException{
//        DB에 이메일이 중복일경우 예외 발생
        if(memberRepository.findByEmail(email).isPresent()){
            throw new IllegalArgumentException("이메일 중복입니다.");
        }
//        객체를 조립후 repository를 통해 register
        T01Member member = new T01Member(name, email, password);
        memberRepository.register(member);
    }

    //    회원상세조회
    public T01Member findById(Long id) throws NoSuchElementException{
//        Optional객체에 값이 없을경우 예외발생. 있으면 Member를 꺼내서 return.
        return memberRepository.findById(id).orElseThrow(()->new NoSuchElementException("id가 없는 id입니다."));
    }

    //    회원목록조회
    public List<T01Member> findAll(){
        return memberRepository.findAll();
    }
    //    로그인
    public void login(String email, String password) throws NoSuchElementException, IllegalArgumentException{
        Optional<T01Member> optionalMember = memberRepository.findByEmail(email);
        if(!optionalMember.isPresent()){
            throw new IllegalArgumentException("잘못된 이메일입니다.");
        }
        if(!optionalMember.get().getPassword().equals(password)){
            throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
        }
    }
}
