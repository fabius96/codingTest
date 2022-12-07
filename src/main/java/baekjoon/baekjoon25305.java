package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/* 커트라인 */
public class baekjoon25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int peopleNum = Integer.parseInt(st.nextToken()); // 응시 학생 수
        int cutLine = Integer.parseInt(st.nextToken()) - 1; // 커트라인
        ArrayList<Integer> scores = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < peopleNum; i++) {

            int score = Integer.parseInt(st.nextToken());
            scores.add(score);
        }
        scores.sort(Collections.reverseOrder());

        bw.write(scores.get(cutLine) + "\n");
        bw.flush();
        bw.close();
    }
}
