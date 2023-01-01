package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

/* 대칭 차집합 */
// https://www.acmicpc.net/problem/1269
public class baekjoon1269 {
    public int solution(int n, int m, int[] a, int[] b) {
        int answer;
        HashSet<Integer> hashSetA = new HashSet<>();
        HashSet<Integer> hashSetB = new HashSet<>();

        for (int i : a) hashSetA.add(i);
        for (int i : b) hashSetA.remove(i);

        for (int i : b) hashSetB.add(i);
        for (int i : a) hashSetB.remove(i);

        answer = hashSetA.size() + hashSetB.size();

        return answer;
    }

    public static void main(String[] args) throws IOException {
        baekjoon1269 T = new baekjoon1269();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 배열 a의 원소 개수
        int m = Integer.parseInt(st.nextToken()); // 배열 b의 원소 개수
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            a[i] = num;
        }
        st = new StringTokenizer(br.readLine());
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            b[i] = num;
        }
        bw.write(T.solution(n, m, a, b) + "\n");
        bw.flush();
        bw.close();
    }
}
