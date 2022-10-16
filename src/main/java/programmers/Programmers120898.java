package programmers;

public class Programmers120898 {
    public int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120898 test = new Programmers120898();
        System.out.println(test.solution("happy birthday!"));
    }
}
