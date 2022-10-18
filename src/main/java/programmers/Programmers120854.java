package programmers;

import java.util.Arrays;

/* 배열 원소의 길이 */
public class Programmers120854 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120854 test = new Programmers120854();
        String[] strlist = new String[]{"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(test.solution(strlist)));
    }
}
