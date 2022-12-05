package programmers;

import java.io.*;

/* 짝수와 홀수 */
public class programmers12973 {
    public String solution(int num) {
        String answer = "Odd";
        if (num % 2 == 0) answer = "Even";
        return answer;
    }

    public static void main(String[] arg) throws IOException {
        programmers12973 test = new programmers12973();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        bw.write(test.solution(num));
        bw.flush();
        bw.close();
    }
}
