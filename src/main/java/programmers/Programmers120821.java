package programmers;

import java.util.Arrays;

/* 배열 뒤집기 */
public class Programmers120821 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i ++){
            answer[i] = num_list[num_list.length-1-i];;
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120821 test = new Programmers120821();
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(test.solution(num_list)));
    }
}
