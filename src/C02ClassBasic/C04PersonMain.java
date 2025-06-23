package C02ClassBasic;


public class C04PersonMain {
    public static void main(String[] args) {
////        회원가입 예시
//        String name1 = "hong1";
//        String email1 = "hong1@naver.com";
//        int age1 = 30;
//
//        String name2 = "hong2";
//        String email2 = "hong2@naver.com";
//        int age2 = 35;
//
//        printMember1(name1, email1, age1);
//        printMember2(name2, email2, age2);
////        위와 같은 방식의 문제점
////        요소(속성)들이 그룹화 되어 있지 않다보니, 중복과 코드의 가독성이 저하된다.
//
////        위와 같은 문제점을 해결하기 위해 클래스에 속성을 정의하고, 객체로 생성하여 그룹화
//        C04Person p1 = new C04Person(); // p1이라는 객체를 만들어서
//        p1.setName("hong1"); // C04Person p1의 setName을 통해 이름 저장
//        System.out.println(p1.getName()); //p1.getName을 통해 hong1 출력
//        p1.setName("hong1@naver.com");
//        System.out.println(p1.getName());
//        p1.setAge(30);
//        System.out.println(p1.getAge());

//        C04Person p2 = new C04Person(); //static이 없으므로 객체변수, 힙 메모리에 객체 p1, p2 고유의 메모리 할당
//        p2.name = "hong2";
//        p2.email = "hong2@naver.com";
//        p2.age = 20;
//        // p1을 별도의 메서드 없이 그냥 출력할 경우 힙 메모리 주소값 출력!
//        System.out.println(p2);
//        printMember2(p2);

//        Person의 변수값이 public으로 오픈되어 있을 경우 다른 class, 다른 package에서 너무 편하게 변경 가능하다.
//        p2.name = "hongildong2"; // hong2 -> hongildong2
//        printMember2(p2);

        C04Person p3 = new C04Person();
        p3.setName("hong3");
        p3.setEmail("hong3@naver.com");
        p3.setAge(30);

        printMember2(p3);
//
////        p3.printPerson();
//        System.out.println(p3.printPerson());



    } //

    public static void printMember1(String name, String email, int age) {
        System.out.println("이름은 :" + name + ", email은 : " + email + ", 나이는 : " + age);
    }

    public static void printMember2(C04Person person) { // person은 객체의 주소값이 매개변수로 전달
        //person.name 은 person주소로 가서 name을 가져옴?
//        System.out.println("이름은 :" + person.name + ", email은 : " + person.email  + ", 나이는 : " + person.age );
        System.out.println("이름은 :" + person.getName() + ", email은 : " + person.getEmail()  + ", 나이는 : " + person.getAge());
    }
}
