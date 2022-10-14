package inflearn;

import java.util.Scanner;

public class inflearn0109 {
    public int solution(String str) {
        StringBuilder answer = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) answer.append(c);
        }
        return Integer.parseInt(answer.toString());
    }

    public static void main(String[] arg) {
        inflearn0109 T = new inflearn0109();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
        scanner.close();
    }
}
