package inflearn;

import java.util.Scanner;

/* 암호(replace(), parseInt(string, 2)) */
public class inflearn0112 {
    public String solution(int n, String s) {
        String answer = "";
        for(int i = 0; i < n; i++){
           String tmp = s.substring(0, 7).replace("#", "1").replace("*", "0");
           int num = Integer.parseInt(tmp, 2);
           answer += (char)num;
           s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] arg) {
        inflearn0112 T = new inflearn0112();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        System.out.println(T.solution(n, s));
        scanner.close();
    }
}
