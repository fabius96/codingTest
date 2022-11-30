package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/* 손익분기점 */
public class baekjoon1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 고정비용
        int B = Integer.parseInt(st.nextToken()); // 가변비용
        int C = Integer.parseInt(st.nextToken()); // 노트북 가격

        if (B > C || C - B == 0) bw.write(-1 + "\n");
        else bw.write(A / (C - B) + 1 + "\n");

        bw.flush();
        bw.close();
    }
}