package programmers;

/* 개미 군단 */
public class Programmers120837 {
    public int solution(int hp) {
        int answer = 0;
        if ((hp % 5) % 3 >= 1) answer += (hp % 5) % 3;
        answer += hp / 5 + (hp % 5) / 3;
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120837 test = new Programmers120837();
        System.out.println(test.solution(1000));
    }
}
