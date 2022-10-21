package programmers;

import java.util.Arrays;

/* 가장 큰 수 찾기 */
public class Programmers120899 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        for(int i = 0; i < array.length; i++){
            if(array[i] > answer[0]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120899 test = new Programmers120899();
        int[] array = {1, 8, 3};
        System.out.println(Arrays.toString(test.solution(array)));
    }
}
