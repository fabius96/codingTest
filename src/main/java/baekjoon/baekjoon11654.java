package baekjoon;

import java.io.*;

public class baekjoon11654 {
    /* 아스키 코드 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char c = br.readLine().charAt(0);
        bw.write((int) c + "\n");
        bw.flush();
        bw.close();
    }
}