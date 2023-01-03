package inflearn;

import java.util.Scanner;
import java.util.Stack;

/* 괄호문자제거 */
// https://cote.inflearn.com/contest/10/problem/05-02
public class inflearn0502 {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == ')') {
                if (stack.contains('(')) while (stack.pop() != '(') ;
            } else stack.push(c);
        }
        for (char c : stack) {
            answer.append(c);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        inflearn0502 T = new inflearn0502();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
