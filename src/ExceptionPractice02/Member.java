package ExceptionPractice02;

public class Member {
    static int staticId;
    private String name;
    private String email;
    private String password;
    private long id;

    public Member(String name, String email, String password) {
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = password;
        staticId++;
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

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }
}
