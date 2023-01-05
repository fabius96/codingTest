package inflearn;

import java.util.Scanner;
import java.util.Stack;

/* 쇠막대기 */
// https://cote.inflearn.com/contest/10/problem/05-05
public class inflearn0505 {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if (str.charAt(i - 1) == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        inflearn0505 T = new inflearn0505();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
