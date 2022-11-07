package programmers;

import java.util.Arrays;

/* 진료 순서 정하기 */
public class Programmers120835 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

       for(int i = 0; i <emergency.length; i++){
           int num = 1;
           for(int j : emergency){
               if(emergency[i] < j) num++;
           }

           answer[i] = num;
           num = 1;
       }

        return answer;
    }

    public static void main(String[] arg) {
        Programmers120835 test = new Programmers120835();
        int[] emergency = {30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(test.solution(emergency)));
    }
}
