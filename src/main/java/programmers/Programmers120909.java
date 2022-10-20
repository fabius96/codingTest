package programmers;

/* 제곱수 판별하기 */
public class Programmers120909 {
    public int solution(int n) {
        int answer = 2;
        for (int i = 1; i < n / 2; i++) {
            if (n / i == i && n % i == 0) {
                answer = 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120909 test = new Programmers120909();
        System.out.println(test.solution(976));
    }
}
