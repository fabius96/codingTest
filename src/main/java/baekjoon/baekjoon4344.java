package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon4344 {
    /* 평균은 넘겠지 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int C = Integer.parseInt(br.readLine()); // 테이스 케이스의 개수
        StringTokenizer st;

        for (int i = 0; i < C; i++) {
            ArrayList<Integer> scores = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 테스트 케이스 별 학생 수
            int sum = 0;

            for (int j = 0; j < N; j++) {
                int score = Integer.parseInt(st.nextToken());
                sum += score;
                scores.add(score);
            }

            int avr = sum / N; // 평균 점수
            int cnt = 0;
            for (int j : scores) {
                if (j > avr) cnt++;
            }
            double answer = ((double) cnt / N) * 100;
            bw.write(String.format("%.3f", answer) + "%" + "\n");
        }
        bw.flush();
        bw.close();
    }
}
