package baekjoon;

import java.io.*;

public class baekjoon2562 {
    /* 최댓값 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;
        int cnt = 0;

        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                cnt = i;
            }
        }

        bw.write(max + "\n" + cnt + "\n");
        bw.flush();
        bw.close();
    }
}
