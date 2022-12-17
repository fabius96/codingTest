package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/* 달팽이는 올라가고 싶다 */
public class baekjoon2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 낮 동안 달팽이가 올라가는 높이
        int B = Integer.parseInt(st.nextToken()); // 밤 동안 달팽이가 미끄러지는 높이
        int V = Integer.parseInt(st.nextToken()); // 달팽이가 올라가야하는 나무 막대 높이

        int day = (V - A) / (A - B);
        if ((V - A) % (A - B) != 0) day++;

        bw.write(day + 1 + "\n");
        bw.flush();
        bw.close();
    }
}
