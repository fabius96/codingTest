package inflearn;

import java.util.Scanner;

public class inflearn0110 {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int far = 100;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) far = 0;
            answer[i] = far;
            far++;
        }

        far = 100;

        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == c) far = 0;
            if(answer[i] > far) answer[i] = far;
            far++;
        }
        return answer;
    }

    public static void main(String[] arg) {
        inflearn0110 T = new inflearn0110();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
            scanner.close();
        }
    }
}
