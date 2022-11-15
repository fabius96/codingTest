package baekjoon;

import java.util.Scanner;

public class baekjoon25304 {
    /* 영수증 */
    public String solution(int X, int n, int[][] arr) {
        String answer = "Yes";
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][0] * arr[i][1];
        }
        if(sum != X) answer = "No";

        return answer;
    }

    public static void main(String[] arg) {
        baekjoon25304 T = new baekjoon25304();
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 1; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(X, n, arr));
        scanner.close();
    }
}

