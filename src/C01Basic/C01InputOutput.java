package C01Basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
//        출력 : System.out을 통해 콘솔 출력
        /*System.out.println(20); // 줄바꿈 있는 출력
        System.out.print("Hello world1"); //줄바꿈이 없는 출력
        System.out.print("Hello world2"); */
//        입력 : Scanner 클래스 : 입력을 위한 클래스, System.in : 키보드 입력
        /*Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine(); //입력 받은 데이터를 한 줄로 읽어서 String으로 리턴
        System.out.println("입력사항 : " + input);*/

//        예를 들어 아래와 가팅 입력값이 주어질 때 처리 방법
        /*
            abc
            bcd
            2
         */
//        Scanner myScanner2 = new Scanner(System.in);
//        String input1 = myScanner2.nextLine();
//        String input2 = myScanner2.nextLine();
//        int input3 = myScanner2.nextInt();
//        System.out.println("입력사항 1 : " + input1);
//        System.out.println("입력사항 2 : " + input2);
//        System.out.println("입력사항 3 : " + input3);

//        입력 : BufferReader + System.in - Scanner말고 BufferedReader를 써라... 성능이 우월하다.
    //        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    //        String input1 = br1.readLine(); //한 줄 씩 읽어서 문자열로 리턴
    //        System.out.println(input1);

//        입력값 : abc bcd fgd , 띄어쓰기가 있는 경우라면?
//        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//        String input2 = br2.readLine(); // String 객체 = new 객체가 원칙, String 객체 = 문자열객체
//        String[] arr = input2.split(" "); //나는 공백을 기준으로 자르겠다.
//        System.out.println(arr [0]);
//        System.out.println(arr [1]);
//        System.out.println(arr [2]);

//        혹은 , 이 방식을 선호한다!!
//        String[] arr = br.readLine().split(" ");
//        System.out.println(arr [0]);
//        System.out.println(arr [1]);
//        System.out.println(arr [2]);

//        BufferedReader + System.in + StringTokenizer
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String input3 = br3.readLine();
        StringTokenizer st = new StringTokenizer(input3); //잘라서 st에 담아줄게!, input3은 문자열의 변수
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());



    }
}
