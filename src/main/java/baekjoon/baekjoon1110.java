package baekjoon;

import java.io.*;

public class baekjoon1110 {
    /* 더하기 사이클 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstInput = Integer.parseInt(br.readLine());
        int num = firstInput;

        int cnt = 0;

        while (true) {
            int left = num / 10;
            int right = num % 10;
            int sum = left + right;

            num = right * 10 + sum % 10;
            cnt++;

            if (firstInput == num) break;

        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}
