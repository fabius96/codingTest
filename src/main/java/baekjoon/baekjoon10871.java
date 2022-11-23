package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon10871 {
    /* X보다 작은 수 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken()); // 정수 N
        int standard = Integer.parseInt(st.nextToken()); // 정수 X
        ArrayList<Integer> arrayList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            int A = Integer.parseInt(st.nextToken());
            if (A < standard) arrayList.add(A);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (i != arrayList.size() - 1) bw.write(arrayList.get(i) + " ");
            else bw.write(arrayList.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
