package baekjoon;

import java.io.*;

/* 거스름돈 */
public class baekjoon14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;

        if (num % 5 == 0) bw.write(num / 5 + "\n");
        else {
            while (true) {
                if (num < 0) {
                    bw.write(-1 + "\n");
                    break;
                }

                num -= 2;
                cnt++;

                if (num % 5 == 0) {
                    cnt += num / 5;
                    bw.write(cnt + "\n");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
