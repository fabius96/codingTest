package inflearn;

import java.util.HashMap;
import java.util.Scanner;

/* 모든 아나그램 찾기(Hash, sliding window : 시간복잡도 O(n)) */
public class inflearn0404 {
    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> aMap = new HashMap<>(); // 문자열 a의 해시맵
        HashMap<Character, Integer> bMap = new HashMap<>(); // 문자열 b의 해시맵

        for (char c : b.toCharArray()) bMap.put(c, bMap.getOrDefault(c, 0) + 1);
        for (int i = 0; i < b.length() - 1; i++) aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0) + 1);

        int left = 0;
        for (int right = b.length()-1; right < a.length(); right++) {
            aMap.put(a.charAt(right), aMap.getOrDefault(a.charAt(right), 0) + 1);
            if (aMap.equals(bMap)) answer++;
            aMap.put(a.charAt(left), aMap.get(a.charAt(left)) - 1);
            if (aMap.get(a.charAt(left)) == 0) aMap.remove(a.charAt(left));
            left++;
        }

        return answer;
    }

    public static void main(String[] args) {
        inflearn0404 T = new inflearn0404();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a, b));
    }
}
