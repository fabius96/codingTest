package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon10818 {
    /* 최소, 최대 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num > max) max = num;
            if(num < min) min = num;
        }

        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
    }
}
