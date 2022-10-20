package programmers;

import java.util.Arrays;

/* 최댓값 만들기(1) */
public class Programmers120847 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }

    public static void main(String[] arg) {
        Programmers120847 test = new Programmers120847();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(test.solution(numbers));
    }
}
