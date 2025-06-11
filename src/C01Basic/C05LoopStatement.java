package C01Basic;
import java.util.*;

public class C05LoopStatement {

    public static void main(String[] args) {
//        int a = 0;
//        while (a < 10) {
//            System.out.println("Hello~");
//            a = a + 1;
//        }

////        while문을 활용하여 2 ~ 10까지 출력
//        int b = 2;
//        while (b < 11) {
//            System.out.println(b);
//            b++;
//        }

//        도어락키 예제 -> 무한 반복 되는 + 맞히면 종료 도어락 키 예제 -> 5회 입력 횟수 제한 있는 도어락키 예제(5회이상초과했습니다.)

//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            int answer = 1234;
//            int input = sc.nextInt();
//            if (input == answer) {
//                System.out.println("문이 열렸습니다.");
//                break; // break를 통해 가장 가까이 있는 반복문을 즉시종료
//            } else {
//                System.out.println("비밀번호가 틀립니다.");
//            }
//        }

//        int count = 0;
//        boolean check = false;
//        while (count < 5) {
//            Scanner sc = new Scanner(System.in);
//            int answer = 1234;
//            int input = Integer.parseInt(sc.nextLine());
//            if (answer == input) {
//                System.out.println("문이 열렸습니다.");
//                check = true;
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//                count++;
//            }
//            if (check == false) {
//                System.out.println("5회 이상 초과했습니다.");
//            }
//        }
//        int count = 0;
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            int answer = 1234;
//            int input = Integer.parseInt(sc.nextLine());
//            if (answer == input) {
//                System.out.println("문이 열렸습니다.");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            count++;
//            if (count==5) {
//                System.out.println("5회 이상 초과했습니다.");
//            }
//        }

////        입력한 숫자의 구구단 단수 출력 ex)2 -> 2*1=2 2*2=4
//
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("구구단 단수를 입력해주세요.");
//            int input = sc.nextInt();
//            int a = 1;
//            while(a < 10){
//                System.out.println(input + "X" + a + " = " + (input*a));
//                a++;
//            } break;
//        }

////        do while문 : 무조건 한 번은 실행되는 while문
//        int a = 100;
//        do {
//            System.out.println(a);
//        }
//        while (a < 10) {
//            System.out.println(a);
//        }
//    }

////    for문 : 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문
////    for문은 사용했던 변수 명을 for문이 끝난 이후에 재선언 가능
//        for (int a = 0; a < 10; a++)  {
//        System.out.println(a);
//    }

////    1 ~ 10 홀수만 출력하기
//        for (int i = 1; i < 11; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//                }
//            }
////        1부터 20까지의 짝수의 총합 출력
//        int total = 0
//        for (int i = 1; i < 21; i++) {
//            if (i % 2 == 0) {
//                total += i;
//            }
//        }
//        System.out.println(total);

////      두 수의 최대공약수 찾기
//        int a = 24;
//        int b = 32;
//        int min = a>b?b:a
//        int answer = 0;
//        for (int i = 1; i <= min; i++) {
//            if (a % i == 0 && b % i == 0) {
//                answer = i;
//            }
//        }
//        System.out.println(answer);
//
//        for (int i = min; i >= 1; i--) {
//            if (a % i == 0 && b % i == 0) {
//                System.out.println(i);
//                break;
//            }
//        }

////        소수구하기 : 1과 자신을 제외한 숫자로 나눠지지 않는 수
////        사용자가 입력한 값이 소수인지 아닌지 판별해주는 프로그램
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean check = false;
//        for (int i = 2; i < input; i++) {
//            if (input % i == 0) {
//                check = true;
//                break;
//            }
//        }
//        if (check == false) { // !check로 쓸 수도 있다.
//            System.out.println("소수입니다.");
//        } else {
//            System.out.println("소수가 아닙니다.");
//        }
////        소수 구할 때 root를 기준으로 하면?
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean check = false;
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                check = true;
                break;
            }
        }
//        if(!check) {
//            System.out.println("소수입니다.");
//        } else {
//            System.out.println("소수가 아닙니다.");
//        }

////        continue : 반복문의 조건식으로 이동하는 명령어.
////        홀수만 출력
//        for (int i = 1; i < 11; i++) {
//            if (i % 2 == 0) {
////                continue는 코드의 직관성과 가독성을 위해 사용한다. 대체 방법이 있을 수 있음.
//                continue;
//            }
//            System.out.println(i);
//        }

////        향상된(enhanced) for문 - for each문
//        int[] arr = {1, 3, 5, 7};
////        일반 for문을 활용한 배열 접근 방식 : 원본 데이터 주소에 접근해서 가져온다.
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
////        향상된 for문을 활용한 배열 접근 방식 : arr을 통째로 들고 와서 하나꺼내고 두개꺼내고 세개꺼내고...
////        just 출력을 위한 용도이다.
//        for(int val : arr) {
//            System.out.println(val);
//        }
////        일반 for문을 통한 arr의 저장된 값 변경
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] += 10;
//        }
////        참조형변수(객체타입)는 기본적으로 변수를 통한 출력 시 메모리 값이 출력된다.
//        //System.out.println(arr); //[I@4c873330 출력
//        System.out.println(Arrays.toString(arr)); //toString을 하고 싶으면 Arrays.toString 외우자

////        향상된 for문을 통한 arr의 저장된 값 변경 -> 원본의 값 변경 불가, 그저 값만 꺼내서 더하는거라..
//        for (int val : arr) {
//            val += 10;
//        }

//        num2 = 30; //if문 중괄호 내에서 정의된 변수는 해당 중괄호 밖에서는 사용불가

////        다중 반복문
////        2~9단까지 한꺼번에 출력 + 각 단마다 몇단입니다. 출력.
//        for (int i = 2; i < 10; i++) {
//            System.out.println(i + "단 입니다.");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + "X" + j + "=" + (i*j));
//            }
//        }

//         라벨문 : 반복문에 이름을 붙이는 것.
        loop1:
        for (int i = 0; i < 10; i++) {
            loop2:
            for (int j = 0; j < 10; j++) {
                if (true) {
                    break loop1; //원하는 for문을 라벨문을 통해 종료 시킬 수 있다.
                }
            }
        }

////        이차원배열 : 배열 안에 배열
//        int[][] arr = {{1, 2, 3}, {4, 5, 11}, {7, 8, 9}, {10, 11, 12}};
//        System.out.println(arr[1][2]); //1번째 배열에 2번째 값을 찾는 것.

//        숫자 11이 위치한 배열의 index값 출력 (1, 2) 또는 (3, 1)
//        가장 먼저 찾아지는 11의 위치만 출력 (내부 for에서 break)
        int[][] arr = {{1, 2, 3}, {4, 5, 11}, {7, 8, 9}, {10, 11, 12}};
        loop1:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 11) {
                    System.out.println("위치는 " + i + ", " + j); //sout을 어디서 했어야 할 지, 뭘 출력을 해야할지 헷갈림
                    break;
                }
            }
        }
////                라벨링없는 풀이
//        boolean check=false;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                if(arr[i][j]==11){
//                    check = true;
//                    System.out.println("위치는 " + i + ", " + j + "입니다.");
//                    break ;
//                }
//            }
//            if(check){
//                break;
//            }
//        }

//        라벨링 활용 문제풀이
//        100 ~ 200까지 수 중에서 가장 작은 소수를 출력
        for (int i = 100; i <= 200; i++) {
            boolean check = false;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) { //소수가 아닌건 알겠으나 i가 소수가 아닌지, j가 소수가 아닌지 모르겠음
                    break;
                }
            }
            if (check == false) {
                System.out.println(i + "가 소수입니다.");
                break;
            }
        }

        loop:
        for (int i = 100; i < 201; i++) {
            for (int j = 2; j < Math.sqrt(i)+1; j++) {
                if (i % j == 0) {
                    continue loop;
                }
            }
            System.out.println(i);
            break;
        }



    }
}




