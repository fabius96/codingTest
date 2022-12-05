package programmers;

import java.io.*;

/*정수 제곱근 판별*/
public class programmers12934 {
    public long solution(long n) {
        long answer = -1;

        if (n == 1) return 4;

        for (long i = 2; i < n / 2 + 1; i++) {
            if (n == i * i) {
                answer = (i + 1) * (i + 1);
                break;
            }
        }

        return answer;
    }

    public static void main(String[] arg) throws IOException {
        programmers12934 test = new programmers12934();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        long answer = test.solution(n);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
