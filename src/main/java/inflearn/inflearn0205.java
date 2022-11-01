package inflearn;

import java.util.Scanner;

/* 에라토스테네스 채 */
public class inflearn0205 {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) ch[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        inflearn0205 T = new inflearn0205();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(T.solution(n));
    }
}
