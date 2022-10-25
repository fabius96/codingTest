package inflearn;

import java.util.Scanner;

/* 피보나치 수열 */
public class inflearn0204 {
    public int[] solution(int n) {
        int[] answer = new int[n];
        for (int i = 0; i < answer.length; i++) {
            if (i == 0 || i == 1) answer[i] = 1;
            else answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;
    }

    public static void main(String[] arg) {
        inflearn0204 T = new inflearn0204();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i : T.solution(n)) System.out.print(i + " ");
    }
}
