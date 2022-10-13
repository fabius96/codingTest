package inflearn;

import java.util.Scanner;

public class inflearn0107 {
    public String solution(String str) {
        String answer= "YES";
        char[] charArray = str.toUpperCase().toCharArray();
        int a = charArray.length;
        for (int i = 0; i < str.length()/2; i++) {
            System.out.println(charArray[i]);
            System.out.println(charArray[a-1]);
            if (charArray[i] != charArray[a-1]) answer = "NO";
            a--;
        }
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
