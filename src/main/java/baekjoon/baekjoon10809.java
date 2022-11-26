package baekjoon;

import java.io.*;

public class baekjoon10809 {
    /* 알파벳 찾기 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] stringArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (String s : stringArray) {
            bw.write(str.indexOf(s) + " ");
        }
        bw.flush();
        bw.close();
    }
}
