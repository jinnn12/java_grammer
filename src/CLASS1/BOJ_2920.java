package CLASS1;

import java.io.*;
import java.util.*;
public class BOJ_2920 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        int[] asc = new int[8];

        for (int i = 0; i < asc.length; i++) {
            asc[i] = sc.nextInt();
            if (asc[i] == asc[i] + 1) { // 하나라도 같으면 asc가 나와버림; 제약이 더 필요하지 않을까?
                System.out.println("ascending");
                break;
            }
        }

        int[] dec = new int[8];

        for (int i = dec.length; i > 0; i--) {
            dec[i] = sc.nextInt();
            if (dec[i])
        }















//        for (int i = 0; i < asc.length; i++) {
//            asc[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < asc.length - 1; i++) {
//            if (asc[i + 1] == asc[i] + 1) {
//                System.out.println("ascending");
//                break;
//            } else if (asc[i] - 1 == asc[i + 1]) {
//                System.out.println("descending");
//                break;
//            } else {
//                System.out.println("mixed");
//                break;
//            }
//        }
    }
}
