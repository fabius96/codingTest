package baekjoon;

import java.io.*;
import java.util.*;


public class baekjoon3052 {
    /* 나머지 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine()) % 42;
            if (!arrayList.contains(num)) {
                arrayList.add(num);
                cnt++;
            }
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}
