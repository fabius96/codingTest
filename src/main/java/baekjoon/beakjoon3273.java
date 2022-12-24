package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 두 수의 합 */
public class beakjoon3273 {
    public int solution(int n, int[] arr, int x) {
        int answer = 0, start = 0, end = n - 1;
        Arrays.sort(arr);

        while (end > start) {
            int sum = arr[start] + arr[end];
            if (sum == x) answer++;
            if (sum >= x) end--;
            if (sum < x) start++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        beakjoon3273 T = new beakjoon3273();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 정수 n개 - 수열의 길이
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        int x = Integer.parseInt(br.readLine()); // 자연수 x - arr[i]와 arr[j]의 합으로 나와야하는 값

        bw.write(T.solution(n, arr, x) + "\n");
        bw.flush();
        bw.close();
    }
}
