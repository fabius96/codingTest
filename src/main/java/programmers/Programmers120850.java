package programmers;

import java.util.ArrayList;
import java.util.Arrays;

/* 문자열 정렬하기 (1) */
public class Programmers120850 {
    public int[] solution(String my_string) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i)))
                arrayList.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
        }
        int[] answer = new int[arrayList.size()];
        for (int i = 0;  i< answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120850 test = new Programmers120850();
        System.out.println(Arrays.toString(test.solution("hi12392")));
    }
}
