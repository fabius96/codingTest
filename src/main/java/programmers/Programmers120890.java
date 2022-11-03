package programmers;

import java.util.Arrays;

/* 가까운 수 */
public class Programmers120890 {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i] - n) < Math.abs(array[i - 1] - n)) answer++;
        }
        return array[answer];
    }

    public static void main(String[] arg) {
        Programmers120890 test = new Programmers120890();
        int[] array = {10, 12, 13};
        System.out.println(test.solution(array, 11));
    }
}
