package inflearn;

import java.util.Scanner;

public class inflearn0106 {
    public String solution(String str) {
        String answer= "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] arg) {
        inflearn0106 T = new inflearn0106();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
        scanner.close();
    }
}
