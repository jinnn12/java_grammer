package Practice;
import java.util.*;
////        1.회원가입 : 이름(String), 이메일(String), pw(String), id값(auto_increment)
////        2.회원 전체 목록 조회 : id, email <author for문>
////        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글 수
////        4.게시글 작성 : title, contents, 작성자Email(author 객체)
////        5.게시물 목록 조회 : id(post), title
////        6.게시물 상세 조회(회원-email 검증, id로 조회) : id(post), title, contents, 작성자email(작성자 이름, author 객체 주소)
////        7.서비스 종료
public class C10BoardPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();

        while (true) {
            System.out.println("서비스를 선택하세요.");
            System.out.println("1.회원가입  2.회원 전체 목록 조회  3.회원 상세 조회  4.게시글 작성  5.게시물 목록 조회  6.게시물 상세 조회");
            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("회원가입 서비스입니다.");
                System.out.println("이름을 입력하세요.");
                String name = sc.nextLine();
                System.out.println("이메일을 입력하세요.");
                String email = sc.nextLine();
                System.out.println("아이디를 입력하세요.");
                String authorId = sc.nextLine();
                System.out.println("비밀번호를 입력하세요.");
                String pw = sc.nextLine();

                Author author = new Author(name, email, authorId, pw);
                authorList.add(author);

                System.out.println("회원가입이 완료되었습니다.");

            } else if (input.equals("2")) {
                System.out.println("회원 전체 목록조회입니다.");

                for (Author a : authorList) {
                    System.out.println(a);
                }

            } else if (input.equals("3")) {
                System.out.println("회원 상세 조회입니다."); // id, email, pw, 작성글 수
                System.out.println("회원 아이디를 입력하세요.");
                String authorId = sc.nextLine();
                Author author = null;
                for (Author a : authorList) {
                    if (a.getAuthorId().equals(authorId)) {
                        author = a;
                    }
                }
                System.out.println("아이디 : " + authorId + " 이메일 : " + author.getEmail() + " pw : " + author.getPw() + " 작성글 수 : " + author.getPostList().size());


            } else if (input.equals("4")) {
                System.out.println("게시글 작성 서비스 입니다.");
                System.out.println("제목을 입력하세요.");
                String title = sc.nextLine();
                System.out.println("내용을 입력하세요.");
                String contents = sc.nextLine();
                System.out.println("작성자 이메일을 입력하세요.");
                String email = sc.nextLine();
                Author author = null;

                for (Author a : authorList) {
                    if (a.getEmail().equals(email)) {
                        author = a;
                    }
                }
                Post post = new Post (title, contents, author);
                postList.add(post);

                System.out.println("글 작성이 완료 되었습니다.");

            } else if (input.equals("5")) {
                System.out.println("글 전체 목록 조회입니다.");
                for (Post p : postList) {
                    System.out.println(p);
                }

            } else if (input.equals("6")) {
                System.out.println("게시글 상세 조회입니다.");
                System.out.println("게시글의 아이디를 입력해주세요.");
                Long postId = Long.parseLong(sc.nextLine());

                Post post = null;
                for (Post p : postList) {
                    if (p.getPostId().equals(postId)) {
                        post = p;
                    }
                }
                System.out.println("제목 : " + post.getTitle() + " 내용 : " + post.getContents() + " 글쓴이 : " + post.getAuthor().getAuthorId());


            } else {
                break;
            }


        }
    }
}

class Author {
    private Long id;
    private static Long static_id = 0L;
    private String name;
    private String email;
    private String authorId;
    private String pw;
    List<Post> postList;

    public Author(String name, String email, String authorId, String pw) {
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.authorId = authorId;
        this.pw = pw;
        this.postList = new ArrayList<>();
        static_id++;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getAuthorId() {
        return authorId;
    }
    public String getPw() {
        return pw;
    }
    public List<Post> getPostList() {
        return postList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", authorId='" + authorId + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}

class Post {

    private Long postId;
    private static Long staticId = 0L;
    private String title;
    private String contents;
//    객체 안에 객체를 선언함으로써 post객체에서 쉽게 author객체에 접근 가능
    private Author author;

    public Post(String title, String contents, Author author) {
        this.postId = staticId;
        this.title = title;
        this.contents = contents;
        this.author = author;
        this.author.getPostList().add(this);
    }

    public Long getPostId() {
        return postId;
    }

    public static Long getStaticId() {
        return staticId;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor() {
        return author;
    }
}


