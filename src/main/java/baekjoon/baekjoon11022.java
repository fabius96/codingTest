package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon11022 {
    /* A+B - 8 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i < T + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;
            bw.write(("Case #" + i + ": " + A + " + " + B + " = " + sum) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

