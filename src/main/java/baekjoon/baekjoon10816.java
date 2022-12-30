package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

/* 숫자 카드 2 */
// https://www.acmicpc.net/problem/10816
public class baekjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n = Integer.parseInt(br.readLine()); // 상근이가 갖고 있는 카드 종류 수
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine()); // 상근이가 갖고 있는 지 확인 할 카드 종류 수
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            bw.write(hashMap.getOrDefault(num, 0) + " ");
        }

        bw.flush();
        bw.close();
    }
}
