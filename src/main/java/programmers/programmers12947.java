package programmers;

import java.io.*;

/* 하샤드 수 */
public class programmers12947 {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += num;
        }

        if (x % sum != 0) answer = false;

        return answer;
    }

    public static void main(String[] arg) throws IOException {
        programmers12947 test = new programmers12947();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(test.solution(x));
    }
}
