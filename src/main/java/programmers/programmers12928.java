package programmers;

import java.io.*;

/* 약수의 합 */
public class programmers12928 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }
        return answer;
    }

    public static void main(String[] arg) throws IOException {
        programmers12928 test = new programmers12928();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int answer = test.solution(n);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
