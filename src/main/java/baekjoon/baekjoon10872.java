package baekjoon;

import java.io.*;

/* 팩토리얼 */
public class baekjoon10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int answer = 1;

        while(num >= 1){
            answer *=num;
            num--;
        }

        bw.write(answer +"\n");
        bw.flush();
        bw.close();
    }
}
