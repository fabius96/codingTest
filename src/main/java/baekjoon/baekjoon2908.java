package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon2908 {
    /* 상수 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb;
        sb = new StringBuilder(st.nextToken());
        int A = Integer.parseInt(String.valueOf(sb.reverse()));
        sb = new StringBuilder(st.nextToken());
        int B = Integer.parseInt(String.valueOf(sb.reverse()));

        bw.write(Integer.max(A, B) + "\n");
        bw.flush();
        bw.close();
    }
}
