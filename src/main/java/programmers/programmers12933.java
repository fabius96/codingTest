package programmers;

import java.io.*;
import java.util.Arrays;

/* 정수 내림차순으로 배치하기 */
public class programmers12933 {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        int[] intArray = new int[str.length()];
        for(int i = 0 ; i < str.length(); i++){
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            intArray[i] = num;
        }
        int cipher = 1;
        Arrays.sort(intArray);
        for(int i : intArray){
            answer += (long)i * cipher;
            cipher *= 10;
        }
        return answer;
    }

    public static void main(String[] arg) throws IOException {
        programmers12933 test = new programmers12933();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(test.solution(Long.parseLong(br.readLine())) + "\n");
        bw.flush();
        bw.close();
    }
}
