package baekjoon;

import java.io.*;

public class baekjoon2438 {
        /* 별찍기 -1 */
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int N = Integer.parseInt(br.readLine());
            String star = "*";

            for (int i = 1; i <= N; i++) {
                bw.write(star + "\n");
                star += "*";
            }
            bw.flush();
            bw.close();
        }
}

