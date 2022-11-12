package inflearn;

import java.util.Scanner;

/* 봉우리 */
public class inflearn0210 {
    private final int[] dx = {-1, 0, 1, 0};
    private final int[] dy = {0, 1, 0, -1};

    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean peak = true;
                for (int k = 0; k < 4; k++) {
                    int nextXPoint = i + dx[k];
                    int nextYPoint = j + dy[k];
                    if (nextXPoint >= 0 && nextXPoint < n && nextYPoint >= 0 && nextYPoint < n && arr[nextXPoint][nextYPoint] >= arr[i][j]) {
                        peak = false;
                        break;
                    }
                }
                if (peak) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] arg) {
        inflearn0210 T = new inflearn0210();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
        scanner.close();
    }
}
