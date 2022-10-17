package programmers;

import java.util.Arrays;

/* 프로그래머스 - level0 - 아이스 아메리카노 */
public class Programmers120819 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120819 test = new Programmers120819();
        System.out.println(Arrays.toString(test.solution(15000)));
    }
}
