package programmers;

import java.io.*;
import java.util.Arrays;

/* 자연수 뒤집어 배열로 만들기 */
public class programmers12932 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        int tmp = 0;
        for(int i = str.length() -1; i>= 0; i--){
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            answer[tmp] = num;
            tmp++;
        }
        return answer;
    }

    public static void main(String[] arg) throws IOException {
        programmers12932 test = new programmers12932();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        int[] answer = test.solution(n);
        bw.write(Arrays.toString(answer) + "\n");
        bw.flush();
        bw.close();
    }
}
