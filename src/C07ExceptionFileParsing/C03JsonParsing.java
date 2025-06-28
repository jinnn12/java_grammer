package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

// 역직렬화 (parsing) : readValue, readTree
// 기본생성자 + getter 필수!
public class C03JsonParsing {
    public static void main(String[] args) throws IOException {
//        ObjectMapper : json 직렬화, 역직렬화를 위한 라이브러리
        ObjectMapper o1 = new ObjectMapper();
////      사용법1.객체생성 : 클래스명 객체명 = o1.readValue(문자열, 클래스명); //json문자열을 객체로 만들어줌
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/myjson1.json");
//        String st1 = Files.readString(filePath); // Files 클래스의 readStirng
//        Map<String, String> myMap = o1.readValue(st1, Map.class); // 그냥 Map만 치면 안됨;; .class 해줘야함 -> 클래스 정보 넘겨준다???
//        System.out.println(myMap.get("name"));
//        System.out.println(myMap);
//
//        Student s1 = o1.readValue(st1, Student.class);
//        System.out.println(s1);
//
////        Path filePath2 = Paths.get("src/C07ExceptionFileParsing/myjson1.json");
////        String st2 = Files.readString(filePath2);
////        List<Student> studentList = o1.readValue(st2, ???) // List 클래스도 아니고 Student 클래스도 아니고, 자료구조 너 대체 뭐냐?

////      사용법2.트리구조의 JsonNode로 변환 : JsonNode 객체명 = o1.readTree(문자열);
////      복잡한 json 자료구조일 경우 트리구조의 JsonNode 사용 (노드 안에서 노드 안에서 노드 . . .)
//        JsonNode jsonNodes = o1.readTree(st1);
//        Map<String, String> myMap2 = new HashMap<>();
//        myMap2.put("id", jsonNodes.get("id").asText());
//        myMap2.put("name", jsonNodes.get("name").asText());
//        myMap2.put("classNumber", jsonNodes.get("classNumber").asText());
//        myMap2.put("city", jsonNodes.get("city").asText());
//        System.out.println(myMap2);

//        실습 : myjson2를 갖고 List<Student>객체 형식으로 전환
        Path filePath2 = Paths.get("src/C07ExceptionFileParsing/myjson2.json");
        String st2 = Files.readString(filePath2);
        JsonNode jsonNodes2 = o1.readTree(st2);
        List<Student> studentList = new ArrayList<>();
        for (JsonNode j : jsonNodes2) {
            Student s1 = o1.readValue(j.toString(), Student.class); // readValue로 형변환
            studentList.add(s1);
        }
        System.out.println(studentList);

//        json 직렬화 : 객체 -> json 변환. writeValueAsString(객체)
        String returnSt = o1.writeValueAsString(studentList);
        System.out.println(returnSt); // 이게 json 출력!


    }
}

// 실제 값의 setting은 private이라 할 지라도, 직접 접근하여 setting하고 있음 (reflection 기술을 활용하여 접근)
// objectmapper는 getter의 메서드명을 통해 필드값을 유추하므로 반드시 기본생성자 + getter는 있어야 함.

class Student { // 필드명이 키값이므로 json의 키값과 같아야 함
    private int id;
    private String name;
    private String classNumber;
    private String city;

//    public Student() {} // default 생성자 필요
//    public Student(int id, String name, String classNumber, String city) {
//        this.id = id;
//        this.name = name;
//        this.classNumber = classNumber;
//        this.city = city;
//    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}