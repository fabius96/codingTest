package programmers;

import java.util.Objects;

/* 배열의 유사도 */
public class Programmers120903 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String str : s1) {
            for (String s : s2) {
                if (str.equals(s)) answer++;
            }
        }
        return answer;
    }


    public static void main(String[] arg) {
        Programmers120903 test = new Programmers120903();
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(test.solution(s1, s2));
    }
}
