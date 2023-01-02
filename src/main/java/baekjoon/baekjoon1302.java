package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 베스트셀러 */
// https://www.acmicpc.net/problem/1302
public class baekjoon1302 {
    public String solution(int n, String[] book) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            hashMap.put(book[i], hashMap.getOrDefault(book[i], 0) + 1);
            max = Math.max(max, hashMap.get(book[i]));
        }

        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : hashMap.keySet()) {
            int num = hashMap.get(str);
            if (num == max) arrayList.add(str);
        }
        Collections.sort(arrayList);
        answer = arrayList.get(0);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        baekjoon1302 T = new baekjoon1302();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 오늘 하루 동안 팔린 책의 개수
        String[] book = new String[n];
        for (int i = 0; i < n; i++) {
            String title = br.readLine();
            book[i] = title;
        }
        bw.write(T.solution(n, book) + "\n");
        bw.flush();
        bw.close();
    }
}
