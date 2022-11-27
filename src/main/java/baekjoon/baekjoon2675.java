package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon2675 {
    /* 문자열 반복 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 T
        StringTokenizer st;
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());   // 문자 반복 횟수 R
            String str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                if (!str.contains(String.valueOf(str.charAt(j)))) arrayList.add(String.valueOf(str.charAt(j)));
                for (int k = 0; k < R; k++) {
                    bw.write(String.valueOf(str.charAt(j)));
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
