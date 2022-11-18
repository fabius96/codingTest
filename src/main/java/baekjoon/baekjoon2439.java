package baekjoon;

import java.io.*;

public class baekjoon2439 {
    /* 별찍기 -2 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String star = "*";
        String blank = " ".repeat(N);
        for (int i = 1; i <= N; i++) {
            blank = blank.substring(1);
            bw.write(blank + star + "\n");
            star += "*";
        }
        bw.flush();
        bw.close();
    }
}

