package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon10951 {
    /* A+B - 4 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            if (!st.hasMoreTokens()) break;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}

