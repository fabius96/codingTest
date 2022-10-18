package programmers;

import java.util.Arrays;

/* 짝수는 싫어요 */
public class Programmers120813 {
    public int[] solution(int n) {
        int[] answer = new int[n / 2 + n % 2];
        int a = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                answer[a] = i;
                a++;
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120813 test = new Programmers120813();
        System.out.println(Arrays.toString(test.solution(10)));
    }
}
