package inflearn;

import java.util.Scanner;

public class inflearn0107 {
    public String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if ((str.equalsIgnoreCase(tmp))) answer = "YES";
        return answer;
    }

    public static void main(String[] arg) {
        inflearn0107 T = new inflearn0107();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
        scanner.close();
    }
}
