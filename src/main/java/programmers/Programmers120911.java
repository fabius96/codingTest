package programmers;

import java.util.Arrays;

/* 문자열 정렬하기 (2) */
public class Programmers120911 {
    public String solution(String my_string) {
        char[] answer = my_string.toLowerCase().toCharArray();
        Arrays.sort(answer);
        return new String(answer);
    }

    public static void main(String[] arg) {
        Programmers120911 test = new Programmers120911();
        System.out.println(test.solution("Bcad"));
    }
}
