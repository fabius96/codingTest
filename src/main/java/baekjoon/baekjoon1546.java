package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon1546 {
    /* 평균 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine()); // 과목 수
        ArrayList<Integer> arrayList = new ArrayList<>(); // 시험 점수 배열
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            arrayList.add(tmp);
        }

        arrayList.sort(Collections.reverseOrder());
        int max = arrayList.get(0); // 최고점수
        double sum = 0; // 조작된 점수 합

        for (int a : arrayList) {
            sum += (double) a / max * 100;
        }
        bw.write(sum/num + "\n");
        bw.flush();
        bw.close();
    }
}
