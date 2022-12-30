package baekjoon;

import java.io.*;
import java.util.*;

/* 듣보잡 */
// https://www.acmicpc.net/problem/1764
public class baekjoon1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람 수
        int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람 수
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hashSet.add(br.readLine());
        }

        int cnt = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (hashSet.contains(name)) {
                cnt++;
                arrayList.add(name);
            }
        }
        Collections.sort(arrayList);

        bw.write(cnt + "\n");
        for (String str : arrayList) bw.write(str + "\n");
        bw.flush();
        bw.close();
    }
}
