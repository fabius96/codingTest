package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/* 소수 찾기 */
public class baekjoon1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 숫자 N개
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0; // 소수의 개수

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) cnt--;
            int check = 0;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    check++;
                    break;
                }
            }
            if (check == 0) cnt++;
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}
