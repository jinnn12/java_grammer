package C07ExceptionFileParsing;

import java.io.*;


public class C02File {
    public static void main(String[] args) throws IOException {
////        콘솔창 입출력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //인풋스트림리더 -> 바이트 x 문자단위로 받겟다
//        String input = br.readLine();
//        System.out.println(input);

////        파일에서 읽기 : IO패키지
//        BufferedReader br2 = new BufferedReader(new FileReader(C07ExceptionFileParsing/test.txt));
//        String line = br2.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = br2.readLine();
//        }
//
////        파일에서 읽기 : NIO 패키지
//        Path filePath = Path.get("C07ExceptionFileParsing/test.txt");
////        readString : 문자열 전체를 통으로 read
//        Strings t1 = Files.readString(filePath);
//        System.out.println(t1);
//
////        readAllLines : 문자열을 나열별로 split 하여 List 형태로 저장
//        List<String> st2 = Files.readAllLines(filePat);
//        System.out.println(st2);

////        파일쓰기
//        BufferedReader br2 = new BufferedReader(new FileReader(src/C07ExceptionFileParsing/test.txt));
//        Files.write(filePath, "홍길동1\n".getBytes(), StandardOpenOption.CREATE_NEW); //CREATE_NEW : 새로입력
//        Files.write(filePath, "홍길동2\n".getBytes(), StandardOpenOption.WRITE); //WRITE : 덮어쓰기
//        Files.write(filePath, "홍길동3\n".getBytes(), StandardOpenOption.APPEND); //APPEND : 추가모드

    }
}
