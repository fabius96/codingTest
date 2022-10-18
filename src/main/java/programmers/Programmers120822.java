package programmers;

public class Programmers120822 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(my_string);
        answer.reverse();
        return answer.toString();
    }

    public static void main(String[] arg) {
        Programmers120822 test = new Programmers120822();
        System.out.println(test.solution("jaron"));
    }
}
