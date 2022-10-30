package programmers;

/* 합성수 찾기 */
public class Programmers120846 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            int tmp = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) tmp++;
            }
            if (tmp > 2) answer++;
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120846 test = new Programmers120846();
        System.out.println(test.solution(10));
    }
}
