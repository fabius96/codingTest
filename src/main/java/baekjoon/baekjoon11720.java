package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon11720 {
    /* 숫자의 합 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            arrayList.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }

        for (int i : arrayList) {
            sum += i;
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}
