package C02ClassBasic;

import java.util.*;
// Post에 authorEmail에 String으로 저장
// Post에 Author 객체로 저장
//        1.회원가입 : 이름(String), 이메일(String), pw(String), id값(auto_increment)
//        2.회원 전체 목록 조회 : id, email <author for문>
//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글 수
//        4.게시글 작성 : title, contents, 작성자Email(author 객체)
//        5.게시물 목록 조회 : id(post), title
//        6.게시물 상세 조회(회원-email 검증, id로 조회) : id(post), title, contents, 작성자email(작성자 이름, author 객체 주소)
//        7.서비스 종료
public class C10BoradService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();

        while (true) {

            System.out.println("서비스를 선택하세요.");
            System.out.println("1.회원가입  2.회원 전체 목록 조회  3.회원 상세 조회  4.게시글 작성  5.게시물 목록 조회  6.게시물 상세 조회");
            String input = sc.nextLine();
            if (input.equals("1")) { //회원가입

                System.out.println("회원가입");

                System.out.println("----------");
                System.out.println("이름을 입력하세요.");
                String name = sc.nextLine();

                System.out.println("이메일을 입력하세요");
                String email = sc.nextLine();

                System.out.println("아이디를 입력하세요");
                String id = sc.nextLine();

                System.out.println("비밀번호를 입력하세요");
                String pw = sc.nextLine();
                System.out.println("회원가입이 완료되었습니다.");
                System.out.println("----------");

                Author author = new Author(name, email, id, pw);
                authorList.add(author);

                System.out.println(author);

            } else if (input.equals("2")) { //회원 전체 목록 조회
                System.out.println("회원 전체 목록 조회");
                for (Author s : authorList) {
                    System.out.println("ID : " + s.getId() + " / Email : " + s.getEmail());
                }

            } else if (input.equals("3")) {
                System.out.println("회원 상세 조회");
                System.out.println("----------");

                System.out.println("아이디를 입력하세요");
                String id = sc.nextLine();

                Author inputID = null;

                for(Author a : authorList) {
                    if (a.getId().equals(id)) {
                        inputID = a;
                        break;
                    }
                }


                System.out.println(inputID);


            } else if (input.equals("4")) {
                System.out.println("게시글 작성");
                System.out.println("----------");

                System.out.println("작성자 이메일을 입력하세요.");
                String email = sc.nextLine();
                System.out.println("제목을 입력하세요.");
                String title = sc.nextLine();
                System.out.println("내용을 입력하세요.");
                String contents = sc.nextLine();
                System.out.println("작성이 완료되었습니다.");

                Author myAuthor = null;
                for (Author pp : authorList) {
                    if (pp.getEmail().equals(email)) {
                        myAuthor = pp;
                        break;
                    }
                }
//                    int count = 0;
//                    for (Post p : postList) {
//                        if(p.getauthorEmail().equals(author.getEmail())) {
//                            count++;
//                        }
//                    }
//
//                }

                Post post = new Post(email, title, contents, myAuthor);
                postList.add(post);


            } else if (input.equals("5")) { // 이메일엔 내용이, 제목엔 이메일이 출력 / 제목은 출력이 안됨.
                System.out.println("게시물 목록 조회");
                System.out.println("----------");
                for (Post p : postList) {
                    System.out.println("작성자 이메일 : " + p.getEmail() + " / 제목 : " + p.getTitle());
                }

            } else if (input.equals("6")) {
                System.out.println("게시물 상세 조회");
                System.out.println("----------");
                System.out.println("이메일(혹은 아이디)을 입력하세요");
                String email = sc.nextLine();

                Post post = null;

                for (Post c : postList) {
                    if (c.author.getEmail().equals(email)) {
                        post = c;
                        System.out.println(c.author.getPosts());
                    }
//                    } else {
                        System.out.println("게시글 작성자가 없습니다.");
                    }
                }
                System.out.println(postList);
            }

        }
    }
}

class Author {
//    필드
//    public static int id_count = 0;
//    일반적으로 클래스를 정의할 때 원시자료형은 wrapper클래스로 정의

    private String name;
    private String email;
    private String id;

    private String pw;
//    List<Post> posts = new ArrayList<>();

//    생성자
    public Author(String name, String email, String id, String pw) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.pw = pw;


    }

//    public Author(int id_count) {
//        this.id_count = id_count++;
//    }

//    메서드
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getId() {
        return id;
    }
    public String getPw() {
        return pw;
    }
    public List<Post> getPosts() {
        return posts;
    }



//    Post p1 = new Post();
//    postList.add(p1);


    @Override
    public String toString() {
        return "Author{" +
                "이름 : '" + name + '\'' +
                ", 이메일 : '" + email + '\'' +
                ", 아이디 : '" + id + '\'' +
                ", 비밀번호 : '" + pw + '\'' +
                ", 글쓴 개수 : " + posts.size() +
                '}';
    }
}

class Post {
    public static int idCount = 1;
    String title;
    String contents;
    String email;
    int id;
    Author author;
//    Author객체에 본인이 쓴 글 목록인 postList 객체를 만들어둠으로써 편의성 향상

//    생성자
    public Post(String email, String title, String contents, Author author) {
        this.id = idCount++;
        this.email = email;
        this.title = title;
        this.contents = contents;
        this.author = author;
        author.posts.add(this);
    }

//    메서드
    public String getEmail() {
        return email;
    }
    public String getTitle() {
        return title;
    }
    public String getContents() {
        return contents;
    }

//    Author author;
}
