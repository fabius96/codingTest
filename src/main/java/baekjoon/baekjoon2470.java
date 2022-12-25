package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 두 용액 */
public class baekjoon2470 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[2];
        Arrays.sort(arr);

        int mix = Integer.MAX_VALUE, start = 0, end = n - 1;

        while (start < end) {
            int num = Math.abs(arr[start] + arr[end]);
            if(num < mix) {
                mix = num;
                answer[0] = arr[start];
                answer[1] = arr[end];
            }
            if(arr[start] + arr[end] > 0) end--;
            else start++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        baekjoon2470 T = new baekjoon2470();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 전체 용액의 수 n
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        for (int i : T.solution(n, arr)) bw.write(i + " ");
        bw.flush();
        bw.close();
    }
}
