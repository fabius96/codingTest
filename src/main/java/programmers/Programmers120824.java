package programmers;

import java.util.Arrays;

/* 짝수 홀수 개수 */
public class Programmers120824 {
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i : num_list) {
            if (i % 2 == 0) {
                even++;
            } else if(i%2==1) {
                odd++;
            }

        }
        return new int[]{even, odd};
    }

    public static void main(String[] arg) {
        Programmers120824 test = new Programmers120824();
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(test.solution(test.solution(num_list))));
    }
}
