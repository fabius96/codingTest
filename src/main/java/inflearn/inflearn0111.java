package inflearn;

import java.util.Scanner;

/* 문자열 압축 */
public class inflearn0111 {
    public String solution(String str) {
        String answer = "";
        str += " ";
        System.out.println(str);
        int cnt = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) cnt++;
            else {
                answer += str.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        inflearn0111 T = new inflearn0111();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
        scanner.close();
    }
}
