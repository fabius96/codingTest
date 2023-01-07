package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 교육과정 설계 */
// https://cote.inflearn.com/contest/10/problem/05-07
public class inflearn0507 {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for (char c : need.toCharArray()) Q.offer(c);
        for (char c : plan.toCharArray()) {
            //수강신청한 과목이 필수과목인가
            if (Q.contains(c)) {
                if (c != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        inflearn0507 T = new inflearn0507();
        Scanner kb = new Scanner(System.in);
        String need = kb.next(); // 필수 과목 순서
        String plan = kb.next(); // 수강신청한 과목 순서
        System.out.println(T.solution(need, plan));
    }
}
