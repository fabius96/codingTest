package inflearn;

import java.util.HashMap;
import java.util.Scanner;

/* 아나그램(HashMap) */
public class inflearn0402 {
    public String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        inflearn0402 T = new inflearn0402();
        Scanner kb = new Scanner(System.in);
        String s1 = kb.next();
        String s2 = kb.next();
        System.out.println(T.solution(s1, s2));
    }
}
