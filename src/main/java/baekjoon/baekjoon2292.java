package baekjoon;

import java.io.*;

/* 벌집 */
public class baekjoon2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        int answer = 1;
        int num = 1;
        while (true) {
            if (input <= num) {
                break;
            } else num += 6 * answer;
            answer++;
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
