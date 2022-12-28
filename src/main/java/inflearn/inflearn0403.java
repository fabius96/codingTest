package inflearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/* 매출액의 종류(Hash, sliding window) */
public class inflearn0403 {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int left = 0;
        for (int right = k - 1; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            answer.add(map.size());
            map.put(arr[left], map.get(arr[left]) - 1);
            if (map.get(arr[left]) == 0) map.remove(arr[left]);
            left++;
        }

        return answer;
    }

    public static void main(String[] args) {
        inflearn0403 T = new inflearn0403();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int i : T.solution(n, k, arr)) System.out.print(i + " ");
    }
}
