package programmers;

import java.io.*;

/* 자릿수 더하기 */
public class programmers12931 {
        public int solution(int n) {
            int answer = 0;

            String str = String.valueOf(n);
            for(int i = 0; i < str.length(); i++){
                answer += Integer.parseInt(String.valueOf(str.charAt(i)));
            }

            return answer;
        }
    public static void main(String[] arg) throws IOException{
        programmers12931 test = new programmers12931();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int answer = test.solution(n);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
