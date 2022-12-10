package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

/* 소트인사이드 */
public class baekjoon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String numbers = br.readLine();
        ArrayList<Integer> intArrList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length(); i++) {
            int num = Integer.parseInt(String.valueOf(numbers.charAt(i)));
            intArrList.add(num);
        }

        intArrList.sort(Comparator.reverseOrder());
        for (int i : intArrList) {
            sb.append(i);
        }

        bw.write(sb + " \n");
        bw.flush();
        bw.close();
    }
}
