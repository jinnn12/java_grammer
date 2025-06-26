package C05AnonymousLamda.Problem;

import java.io.*;
public class BOJ_2170 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());






    }
}

class Info implements Comparable<Info> {
    int x;
    int y;

    public Info(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Info o) {
        if (this.x == o.x) {
            return o.y - this.y;
        } else {
            return this.x - o.x;
        }
    }
}
