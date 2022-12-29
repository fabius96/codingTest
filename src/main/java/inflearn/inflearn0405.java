package inflearn;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/* K번째 큰 수(TreeSet) */
public class inflearn0405 {
    public int solution(int[] arr, int n, int m) {
        int answer = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    treeSet.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }
        int cnt = 0;
        for (int i : treeSet) {
            cnt++;
            if (cnt == m) return i;
        }

        return answer;
    }

    public static void main(String[] args) {
        inflearn0405 T = new inflearn0405();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr, n, m));
    }
}
