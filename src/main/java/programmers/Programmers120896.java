package programmers;

import java.util.Arrays;

/* 한 번만 등장한 문자 */
public class Programmers120896 {
    public String solution(String s) {
        String tmp = "";

        for (int i = 0; i < s.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) cnt++;
            }
            if (cnt == 1) tmp += s.charAt(i);
        }

        char[] charArray = tmp.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] arg) {
        Programmers120896 test = new Programmers120896();
        System.out.println(test.solution("abcabcadc"));
    }
}
