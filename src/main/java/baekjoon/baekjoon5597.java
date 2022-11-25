package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon5597 {
    /* 과제 안 내신 분..? */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> studentNumber = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            studentNumber.add(num);
        }

        Collections.sort(studentNumber);
        for (int i = 1; i <= 30; i++) {
            if (!studentNumber.contains(i)) bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
