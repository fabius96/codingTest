package programmers;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/* x만큼 간격이 있는 n개의 숫자 */
public class programmers12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;

        for(int i = 0; i<n; i++){
            answer[i] = num;
            num += x;
        }

        return answer;
    }

    public static void main(String[] arg) throws IOException {
        programmers12954 test = new programmers12954();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        System.out.println(Arrays.toString(test.solution(x, n)));
    }
}
