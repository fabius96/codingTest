package baekjoon;

import java.io.*;

/* 그대로 출력하기 */
public class baekjoon11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp;
        while((tmp = br.readLine()) !=null){
            bw.write(tmp + "\n");
        }
        bw.flush();
        bw.close();
    }
}
