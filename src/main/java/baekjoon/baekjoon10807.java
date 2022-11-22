package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon10807 {
    /* 개수 세기 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arrayList = new int[N];

        for (int i = 0; i < N; i++) {
            arrayList[i] = (Integer.parseInt(st.nextToken()));
        }

        int v = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int j : arrayList) {
            if (j == v) cnt++;
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}

