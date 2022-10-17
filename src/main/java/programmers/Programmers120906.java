package programmers;

/* 프로그래머스 - level0 - 자릿수 더하기 */
public class Programmers120906 {
    public int solution(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120906 test = new Programmers120906();
        System.out.println(test.solution(1234));
    }
}
