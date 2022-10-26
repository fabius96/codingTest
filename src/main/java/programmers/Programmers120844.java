package programmers;

import java.util.Arrays;

/* 배열 회전시키기 */
public class Programmers120844 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        answer[0] = numbers[numbers.length - 1];

        for (int i = 1; i < answer.length - 1; i++) {
            int num = -1;
            if (direction.equals("left")) num = 1;
            answer[i] = numbers[i + num];
        }

        if (direction.equals("left")) {
            answer[0] = numbers[1];
            answer[answer.length - 1] = numbers[0];
        } else {
            answer[0] = numbers[numbers.length - 1];
            answer[answer.length - 1] = numbers[numbers.length - 2];
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120844 test = new Programmers120844();
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        System.out.println(Arrays.toString(test.solution(numbers, "left")));
    }
}
