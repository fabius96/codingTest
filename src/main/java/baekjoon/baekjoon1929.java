package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* 소수 구하기 */
// https://www.acmicpc.net/problem/1929
public class baekjoon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startNum = Integer.parseInt(st.nextToken()); // 시작 숫자
        int endNum = Integer.parseInt(st.nextToken()); // 끝 숫자

        int[] checkList = new int[endNum + 1];
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 2; i < endNum + 1; i++) {
            if (checkList[i] == 0) answer.add(i);
            for (int j = i; j < endNum + 1; j = j + i) checkList[j] = 1;
        }
        for (int num : answer) {
            if (num >= startNum) bw.write(num + "\n");
        }

        bw.flush();
        bw.close();
    }
}
