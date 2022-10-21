package programmers;

/* 순서쌍의 개수 */
public class Programmers120836 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120836 test = new Programmers120836();

        System.out.println(test.solution(100));
    }
}
