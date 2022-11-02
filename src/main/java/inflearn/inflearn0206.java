package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

/* 뒤집은 소수 */
public class inflearn0206 {
    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for(int i = 2; i < num; i++){
            if(num%i==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int reverse = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                reverse = reverse * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(reverse)) answer.add(reverse);
        }

        return answer;
    }

    public static void main(String[] arg) {
        inflearn0206 T = new inflearn0206();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
        scanner.close();
    }
}
