package programmers;

import java.util.Arrays;

/* 문자열 정렬하기 (2) */
public class Programmers120911 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(charArray[i])) charArray[i] = Character.toLowerCase(charArray[i]);
        }
        Arrays.sort(charArray);
        for(char c : charArray){
            answer.append(c);
        }
        return answer.toString();
    }

    public static void main(String[] arg) {
        Programmers120911 test = new Programmers120911();
        System.out.println(test.solution("Bcad"));
    }
}
