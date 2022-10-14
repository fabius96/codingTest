package programmers;

public class Programmers120831 {
    public int solution(int n) {
        int answer = 0;
        for (int x = n; x >= 0; x--) {
            if (x % 2 == 0) {
                answer += x;
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120831 test = new Programmers120831();
        System.out.println(test.solution(10));
    }
}
