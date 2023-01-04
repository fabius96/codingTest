package inflearn;

import java.util.Scanner;
import java.util.Stack;

/* 크레인 인형뽑기(카카오) */
// https://cote.inflearn.com/contest/10/problem/05-03
public class inflearn0503 {
    public int soluton(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int positon : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][positon - 1] != 0) {
                    int doll = board[i][positon - 1];
                    board[i][positon - 1] = 0;
                    if (!stack.isEmpty() && doll == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else stack.push(doll);
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        inflearn0503 T = new inflearn0503();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) moves[i] = kb.nextInt();
        System.out.println(T.soluton(board, moves));
    }
}
