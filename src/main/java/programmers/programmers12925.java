package programmers;

import java.io.*;

/* 문자열을 정수로 바꾸기 */
public class programmers12925 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] arg) throws IOException {
        programmers12925 test = new programmers12925();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(test.solution(br.readLine()) + "\n");
        bw.flush();
        bw.close();
    }
}
