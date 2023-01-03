package inflearn;

import java.util.Scanner;
import java.util.Stack;

/* 올바른 괄호 */
// https://cote.inflearn.com/contest/10/problem/05-01
public class inflearn0501 {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        inflearn0501 T = new inflearn0501();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
