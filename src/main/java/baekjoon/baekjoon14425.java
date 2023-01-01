package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

/* 문자열 집합 */
// https://www.acmicpc.net/problem/14425
public class baekjoon14425 {
    public int solution(int n, int m, String[] s, String[] checkList) {
        int answer = 0;
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(s));
        for (String str : checkList) {
            if (hashSet.contains(str)) answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        baekjoon14425 T = new baekjoon14425();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 집합 s의 length
        int m = Integer.parseInt(st.nextToken()); // 집합 s에 포함되어 있는 지 검사해야 하는 문자열 수
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }
        String[] checkList = new String[m];
        for (int i = 0; i < m; i++) {
            checkList[i] = br.readLine();
        }
        bw.write(T.solution(n, m, s, checkList) + "\n");
        bw.flush();
        bw.close();
    }
}
