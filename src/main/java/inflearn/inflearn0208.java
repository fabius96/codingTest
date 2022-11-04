package inflearn;

import java.util.Arrays;
import java.util.Scanner;

/* 등수 구하기 */
public class inflearn0208 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) rank++;
            }
            answer[i] = rank;
            rank = 1;
        }

        return answer;
    }

    public static void main(String[] arg) {
        inflearn0208 T = new inflearn0208();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
        scanner.close();
    }
}
