package inflearn;

import java.util.Scanner;

/* 보이는 학생 */
public class inflearn0202 {
    public int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                answer ++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        inflearn0202 T = new inflearn0202();
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
