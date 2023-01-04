package inflearn;

import java.util.Scanner;
import java.util.Stack;

/* 후위식 연산(postfix) */
// https://cote.inflearn.com/contest/10/problem/05-04
public class inflearn0504 {
    public int solution(String str) {
        int answer;
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) stack.push(c - 48);
            else {
                int right = stack.pop();
                int left = stack.pop();
                if (c == '+') stack.push(left + right);
                else if (c == '-') stack.push(left - right);
                else if (c == '*') stack.push(left * right);
                else if (c == '/') stack.push(left / right);
            }
        }
        answer = stack.get(0);

        return answer;
    }

    public static void main(String[] args) {
        inflearn0504 T = new inflearn0504();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
