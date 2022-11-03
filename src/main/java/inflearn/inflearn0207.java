package inflearn;

import java.util.Scanner;

/* 점수 계산 */
public class inflearn0207 {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int extraPoint = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) extraPoint ++;
            else extraPoint = 0;
            answer += extraPoint;
        }


        return answer;
    }

    public static void main(String[] arg) {
        inflearn0207 T = new inflearn0207();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, arr));
        scanner.close();
    }
}
