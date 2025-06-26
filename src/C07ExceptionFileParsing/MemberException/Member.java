package C07ExceptionFileParsing.MemberException;

public class Member {
    private Long staticId = 0L; // 생성자에서 초기화하면 안되는 이유는 객체가만들어질때마다 0으로 초기화 되기 때문
    private Long id;
    private String name;
    private String email;
    private String password;

    public Member(String name, String email, String password) {
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = password;
        staticId++;
    }

    public Long getStaticId() {
        return staticId;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "staticId=" + staticId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
