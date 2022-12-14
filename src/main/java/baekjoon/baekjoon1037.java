package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/* 약수 */
public class baekjoon1037 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); //N(약수의 개수)
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            int divisor = Integer.parseInt(st.nextToken());
            if(divisor < min) min = divisor;
            if(divisor > max) max = divisor;
        }
        bw.write((min * max) + "\n");
        bw.flush();
        bw.close();
    }
}
