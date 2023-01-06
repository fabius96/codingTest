package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 공주구하기 */
// https://cote.inflearn.com/contest/10/problem/05-06
public class inflearn0506 {
    public int solution(int n, int m) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.offer(i);

        while (!Q.isEmpty()) {
            for (int i = 1; i < m; i++) Q.offer(Q.poll());
            Q.poll();
            if (Q.size() == 1) answer = Q.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        inflearn0506 T = new inflearn0506();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        System.out.println(T.solution(n, m));
    }
}
