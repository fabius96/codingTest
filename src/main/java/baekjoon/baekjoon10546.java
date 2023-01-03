package baekjoon;

import java.io.*;
import java.util.HashMap;

/* 배부른 마라토너 */
// https://www.acmicpc.net/problem/10546
public class baekjoon10546 {
    public String solution(int n, String[] arr1, String[] arr2) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String name : arr1) {
            hashMap.put(name, hashMap.getOrDefault(name, 0) + 1);
        }
        for (String name : arr2) {
            hashMap.put(name, hashMap.get(name) - 1);
        }
        for (String name : hashMap.keySet()) {
            if (hashMap.get(name) >= 1) {
                answer = name;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        baekjoon10546 T = new baekjoon10546();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 마라톤 참가자 수 n
        int m = n - 1; // 완주자 수 m

        String[] arr1 = new String[n]; // 마라톤 참가자 명단
        String[] arr2 = new String[m]; // 마라톤 완주자 명단

        for (int i = 0; i < n; i++) {
            String name = br.readLine(); // 참가자 이름
            arr1[i] = name;
        }

        for (int i = 0; i < m; i++) {
            String name = br.readLine(); // 완주자 이름
            arr2[i] = name;
        }

        bw.write(T.solution(n, arr1, arr2) + "\n");
        bw.flush();
        bw.close();
    }
}
