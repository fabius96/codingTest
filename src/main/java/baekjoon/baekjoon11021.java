package baekjoon;

import java.util.Scanner;

public class baekjoon11021 {
    /* A+B - 7 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 1; i < T+1; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int sum = A + B;
            System.out.println("Case #" + i + ": " + sum);
        }
        scanner.close();
    }
}

