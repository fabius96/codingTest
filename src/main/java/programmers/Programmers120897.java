package programmers;

import java.util.ArrayList;
import java.util.Arrays;

/* 약수 구하기 */
public class Programmers120897 {
    public int[] solution(int n) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tmp.add(i);
            }
        }
        int[] answer = new int[tmp.size()];
        for(int i = 0; i<tmp.size(); i++){
           answer[i] = tmp.get(i);
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120897 test = new Programmers120897();
        System.out.println(Arrays.toString(test.solution(24)));
    }
}
