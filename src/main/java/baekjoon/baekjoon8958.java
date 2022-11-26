package baekjoon;

import java.io.*;

public class baekjoon8958 {
    /* OX퀴즈 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
        char[] charArray = {}; // 임시 char 배열

        for (int i = 0; i < num; i++) {
            charArray = (br.readLine()).toCharArray();
            int score = 0; // 점수
            int cnt = 0; // O 연속성

            for (char c : charArray) {
                if (String.valueOf(c).equals("O")) {
                    score += 1 + cnt;
                    cnt++;
                } else cnt = 0;
            }

            bw.write(score + "\n");
        }

        bw.flush();
        bw.close();
    }
}
