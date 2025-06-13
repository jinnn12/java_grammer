package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class  C06String {
    public static void main(String[] args) {
////        원시자료형은 클래스 기반 x, 스택메모리에 저장되므로 비교시 값 자체를 비교, 기능이 빈약
////        참조자료형 (클래스 (객체) 기반으로 만들어진다.), 힙 메모리 기반 저장돼서 주소값을 보여준다.
//        int a = 10;
//        int b = 10;
//        System.out.println(a == b);
//
////        참조 자료형의 비교는 기본적으로 메모리 주소값 끼리의 비교
//        String str1 = new String("hello");
//        String str2 = new String("hello");
//        System.out.println(str1 == str2); //false, str1, 2의 메모리 주소를 비교하는 것이라 false!
//        System.out.println(str1.equals(str2)); //.equals 메서드를 사용하자
//
////        WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int i1 = 10;
////        Integer ig1 = new Integer(10);
////        자동형변환(오토박싱) : 원시자료형에서 Wrapper 클래스로 자동형변환
//        Integer ig1 = 10;
////        오토언박싱 : Wrapper클래스(integer) -> 원시자료형(int) 자동 형변환
//        int i2 = ig1;
//
////        Wrapper클래스의 기능
//        int i3 = 10;
//        String str3 = Integer.toString(i3);//Integer클래스 안의 toString 메서드
//        String str4 = String.valueOf(i3);
//        int i4 = Integer.parseInt(str3); //parse = 잘라내다, 즉 문자를 숫자로 잘라내겠다
//
////        배열(참조자료형)에는 원시타입 자료형 세팅 가능
//        int[] arr = {10, 20, 30};
//
////        그 외(리스트,set,map) 등에는 참조자료형을 세팅해야 함.
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

////        String 선언 방법 2가지
////        객체선언방식
//        String str1 = new String("hello world");
//        String str2 = new String("hello world");
////        리터럴방식 : 자바에서 추천하는 방식
//        String str3 = "hello world";
//        String str4 = "hello world";
//        System.out.println(str1 == str2); //false
//        System.out.println(str3 == str4); //true
//        System.out.println(str1 == str3); //false
//
////        참조자료형을 비교할 땐 ==을 지양
//        System.out.println(str1.equals(str3));

////        equals : 두 문자열 비교 메서드
//        String str1 = "hello1";
//        String str2 = "hello1";
//        String str3 = "HeLlo1";
//        System.out.println(str1.equals(str2));
//        System.out.println(str2.equals(str3));
//        System.out.println(str2.equalsIgnoreCase(str3)); // Case라는 게 대소문자 구분으로 쓰인다.

////        length : 문자열의 길이 출력, 문자열은 .length(), 배열.lenght 소괄호 x
//        String str1 = "hello1 World1 Java2";
//        System.out.println(str1.length());
////        charAt(n) : 특정 index(n번째)의 문자(char)값을 리턴, char로 받아야 함!
//        char ch1 = str1.charAt(0);

////        위 문자열의 소문자 알파벳의 개수 구하기
////        for, length, charAt 활용! a<= ? <= z
//        String str1 = "hello1 World1 Java2";
//        int total = 0;
//        for (int i = 0; i < str1.length(); i++) {
//                if ('a' < str1.charAt(i) && str1.charAt(i) < 'z') {
//                        total++;
//                }
//        }
//            System.out.println(total);


////         a의 개수가 몇 개인지 출력
//        String str2 = "abcdefgabaaa";
//        int count = 0;
//        for (int i = 0; i < str2.length(); i++) {
//            if (str2.charAt(i) == 'a') {
//                count++;
//            }
//        }
//        System.out.println(count);

////        toCharArray : String 문자열을 char배열로 리턴
//        //char[] chArr = str2.toCharArray();
//        a의 개수는? (toCharArray()를 사용할 것)
//        String str = "abcdefgabaaa";
//        int count = 0;
//        for (char q : str.toCharArray()) {
//            if (q == 'a') {
//                count++;
//            }
//        }
//        System.out.println(count);


////        indexOf() : 특정 문자열의 위치(index) 반환, 가장 먼저 나오는 문자열의 위치 반환
//        String st1 = "hello java java com pu ter";
//        System.out.println(st1.indexOf("pu"));

////        contains : 특정 문자열이 포함되어 있는 지 여부(boolean)를 return
//        String st1 = "hello java java";
//        System.out.println(st1.contains("hello")); //true
//        System.out.println(st1.contains("world")); //false

////        문자열 더하기 : += / StringBuffer:웹개발(Thread-safe), StringBuilder(Thread ?):문제풀이
//        String st1 = "hello";
//        st1 += " world";
//        st1 += '1'; // String에 char를 더하면 String으로 더해짐
//        System.out.println(st1);

//        프로그래머스 - 나머지 구하기(플랫폼 사용방법)
////        프로그래머스 - 특정 문자 제거하기
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if (letter.charAt(0) != my_string.charAt(i)) {
//                answer += my_string.charAt(i);
//            }
//        }
//        System.out.println(answer);

//        String my_string2 = "abcdef";
//        String letter2 = "f";
//        String answer2 = "";
//        for (char c : my_string2.toCharArray()) {
//            if (c != letter2.charAt(0)) {
//                answer2 += c;
//            }
//        }
//        System.out.println(answer2);

////        substring(a,b) : a이상 b미만의 index의 문자를 잘라 문자열 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0, 5));
//        System.out.println(st1.substring(6, st1.length()));

////        프로그래머스 - 특정 문자 제거하기 (substring으로 풀어보기)
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if(!my_string.substring(i, i+1).equals(letter)) {
//                answer += my_string.substring(i, i + 1);
//            }
//        }
//        System.out.println(answer);

//        프로그래머스 - 가운데 글자 가져오기

////        trim, strip : 문자열 양쪽 끝에 공백 제거하는 메서드
//        String st1 = " hello world   ";
//        String trim1 = st1.trim();
//        String strip1 = st1.strip();
//        System.out.println(trim1);
//        System.out.println(strip1);

////        대소문자 변환
////        toUpperCase : 모든 문자열을 대문자로 변환, toLowerCase : 모든 문자열을 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);

////        replace(a,b) : a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);

////        replaceAll(a,b) : replace와 사용법 동일, 정규표현식을 사용 가능한 것이 차이점.
//        String st1 = "01abC123한글123";
////        한글 제거
//        String answer1 = st1.replaceAll("[가-힣]", "");
////        소문자 제거
//        String answer2 = st1.replaceAll("[a-z]", "");
////        대소문자 다 제거
//        String answer3 = st1.replaceAll("[A-Za-z]", "");
//        System.out.println(answer1);
//        System.out.println(answer2);
//        System.out.println(answer3);

////        전화번호 검증
//        String number = "010-1234-1234";
//        boolean check = number.matches("^\\d{3}-\\d{4}-\\d{4}$"); //3자리 4자리 4자리
//        System.out.println(check);
//            if (check == false) {
//                    System.out.println("다시 입력하세요");
//            }
//
////        이메일 검증
//        String email = "한글123@naver.com";
//        boolean check_email = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);
//        System.out.println(check_email);
//
////        split : 특정 문자를 기준으로 잘라서 문자배열로 만드는 것
//            String a = "a:b:c:d";
//            String[] arr = a.split(":");
//            System.out.println(Arrays.toString(arr));
//
//            String b = "a b c  d"; //StringTokenizer를 사용해도 된다. C01InputOutput을 확인해보자!
//            String[] arr2 = b.split(" ");
//            String[] arr3 = b.split("\\s+"); // \s:공백, \n:줄바꿈 외우자
//            System.out.println(Arrays.toString(arr2));
//            System.out.println(Arrays.toString(arr3));

////            null과 공백의 차이
//            String st1 = null; //null은 String이 아님
//            String st2 = ""; //빈문자열, isEmpty
//            String st3 = " "; //공백, isBlank
//            System.out.println(st1==st2); //false
//            //System.out.println(st1.isEmpty()); // NullPointerException  발생
//            System.out.println(st2.isEmpty()); // true
//            System.out.println(st3.isEmpty()); // false, 띄어쓰기도 하나의 문자
//            System.out.println(st3.isBlank()); //true, 스페이스 체크하는 용도
//
//            String abc = "hello   world    java";
//            for (int i = 0; i < abc.length(); i++) {
//                    if (abc.substring(i, i + 1).isBlank()) {
//                            System.out.println(i + "번 째는 Blank");
//                    }
//            }

////            문자열 합치기
//            String[] arr = {"java", "python", "javascript"};
//            String answer1 = "";
//            for (String a : arr) {
//                    answer1 += a;
//                    answer1 += " "; // \n을 사용하면 줄바꿈 추가
//            }
//            System.out.println(answer1);
//            String answer2 = String.join("", arr);
//            System.out.println(answer2);

////         StringBuffer : 문자열 조립 객체
//            StringBuffer sb = new StringBuffer();
////            append는 맨 뒤에 문자열을 더하는 메서드
//            sb.append("java");
//            sb.append("\n"); //wn
//            sb.append("python");
//            sb.append("\n");
//            sb.append("javascript");
//            String answer = sb.toString();
//            System.out.println(answer);
//
//            String[] arr = {"java", "python", "javascript"};
//        StringBuffer sb2 = new StringBuffer();
//        for (int i = 0; i < arr.length; i++) {
//            sb2.append(arr[i]);
//            sb2.append("\n");
//        }
//        sb2.insert(0, "C++");
//        sb2.insert(1, "\n");
//        sb2.deleteCharAt(sb2.length() - 1);
//        System.out.println(sb2);

////      StringBuilder : 문자열 조립 객체 (가장 빠름)
//        String st1 = "hello";
////          StringBuilder는 동시성 이슈 O == Thread-safe하지 않음. 성능이 뛰어남 (문제 풀 때 쓰자)
//        StringBuilder sb = new StringBuilder();
////          StringBuffer는 동시성 이슈X == Thread-safe함(Syncronized). 성능이 떨어짐 (웹개발할때 쓰자)
//        StringBuffer sb2 = new StringBuffer();

////      문자열 뒤집기
//        String st1 = "hello";
//        StringBuilder sb = new StringBuilder();
//        for (int i = st1.length() - 1; i >= 0; i--) {
//            sb.append(st1.charAt(i));
//        }
//        System.out.println(sb);
//
////      프로그래머스 - 문자열 밀기
//        String A = "ohell";
//        String B = "ohell";
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < A.length(); i++) {
//            sb.append(A.charAt(i));
//        }
//        sb.insert(0, sb.length() - 1);
//        sb.deleteCharAt(1, )


        
        
        
        
        
        
    }
}
