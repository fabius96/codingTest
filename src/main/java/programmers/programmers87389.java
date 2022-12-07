package programmers;

import java.io.*;

/* 나머지가 1이 되는 수 찾기 */
public class programmers87389 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] arg) throws IOException {
        programmers87389 test = new programmers87389();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(test.solution(n) + "\n");
        bw.flush();
        bw.close();
    }
}
