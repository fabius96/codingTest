package programmers;

import java.util.Arrays;

/* 배열 두 배 만들기 */
public class Programmers120809 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120809 test = new Programmers120809();
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        System.out.println(Arrays.toString(test.solution(numbers)));
    }
}
