package programmers;

import java.util.Arrays;

/* 배열 가르기 */
public class Programmers120833 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[(num2 - num1 + 1)];
        int a = num1;
        for (int i = 0; i < (num2 - num1 + 1); i++) {
            answer[i] = numbers[a];
            a++;
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120833 test = new Programmers120833();
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(test.solution(numbers, 2, 3)));
    }
}
