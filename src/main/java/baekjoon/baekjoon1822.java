package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

/* 차집합 */
// https://www.acmicpc.net/problem/1822
public class baekjoon1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 집합 A의 원소의 개수
        int m = Integer.parseInt(st.nextToken()); // 집합 B의 원소의 개수
        TreeSet<Integer> treeSet = new TreeSet<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            treeSet.add(num);
        }

        st = new StringTokenizer(br.readLine());
        int answer = n;
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (treeSet.contains(num)) {
                answer--;
                treeSet.remove(num);
            }
        }

        bw.write(answer + "\n");
        for (int i : treeSet) bw.write(i + " ");
        bw.flush();
        bw.close();
    }
}
