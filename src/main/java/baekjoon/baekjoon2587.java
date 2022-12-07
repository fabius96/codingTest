package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 대표값2 */
public class baekjoon2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> intArrList = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            intArrList.add(num);
            sum += num;
        }
        Collections.sort(intArrList);
        bw.write(sum/5 + "\n" + intArrList.get(2) + "\n");
        bw.flush();
        bw.close();
    }
}
