package baekjoon;

import java.io.*;

/* 기찍 N */
// https://www.acmicpc.net/problem/2742
public class baekjoon2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        while (n >= 1) {
            bw.write(n + "\n");
            n -= 1;
        }

        bw.flush();
        bw.close();
    }
}
