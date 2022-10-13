package inflearn;

import java.util.Scanner;

public class inflearn0108 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] arg) {
        inflearn0108 T = new inflearn0108();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
        scanner.close();
    }
}
