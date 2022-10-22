package programmers;

import java.util.ArrayList;
import java.util.Arrays;

/* n의 배수 고르기 */
public class Programmers120905 {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0) {
                arrayList.add(i);
            }
        }
        int[] answer = new int[arrayList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120905 test = new Programmers120905();
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(test.solution(3, numlist)));
    }
}
