package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

/* 수 정렬하기 */
public class baekjoon2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> intArrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (!intArrayList.contains(num)) intArrayList.add(num);
        }

        intArrayList.sort(Comparator.naturalOrder());

        for (int i : intArrayList) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
