package baekjoon;

import java.io.*;
import java.util.Arrays;

/*수 정렬하기 3*/
// https://www.acmicpc.net/problem/10989
public class baekjoon10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cycle = Integer.parseInt(br.readLine());
        int[] intArray = new int[cycle];
        for (int i = 0; i < cycle; i++) {
            intArray[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(intArray);

        for (int i : intArray) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
