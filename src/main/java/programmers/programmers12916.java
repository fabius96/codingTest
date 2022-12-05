package programmers;

import java.io.*;

/* 문자열 내 p와 y의 개수 */
public class programmers12916 {
    boolean solution(String s) {
        boolean answer = true;
        String str = s.toUpperCase();
        int cntP = 0;
        int cntY = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='P') cntP++;
            if (str.charAt(i)=='Y') cntY++;
        }

        if (cntP != cntY) answer = false;

        return answer;
    }

    public static void main(String[] arg) throws IOException {
        programmers12916 test = new programmers12916();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        bw.write(test.solution(s) + "\n");
        bw.flush();
        bw.close();
    }
}
