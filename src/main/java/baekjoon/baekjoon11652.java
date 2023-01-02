package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 카드 */
// https://www.acmicpc.net/problem/11652
public class baekjoon11652 {
    public Long solution(int n, Long[] arr) {
        Long answer;
        HashMap<Long, Integer> hashMap = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
            max = Math.max(max, hashMap.get(arr[i]));
        }

        ArrayList<Long> arrayList = new ArrayList<>();
        for (Long i : hashMap.keySet()) {
            int num = hashMap.get(i);
            if (max == num) arrayList.add(i);
        }

        Collections.sort(arrayList);
        answer = arrayList.get(0);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        baekjoon11652 T = new baekjoon11652();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 준규가 가지고 있는 카드의 개수 N
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++) {
            Long num = Long.parseLong(br.readLine());
            arr[i] = num;
        }
        bw.write(T.solution(n, arr) + "\n");
        bw.flush();
        bw.close();
    }
}
