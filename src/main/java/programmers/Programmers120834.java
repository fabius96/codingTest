package programmers;

/* 외계행성의 나이 */
public class Programmers120834 {
    public String solution(int age) {
        String answer = "";
        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        while (age > 0) {
            answer = alphabets[age % 10] + answer;
            age /= 10;
        }

        return answer;
    }

    public static void main(String[] arg) {
        Programmers120834 test = new Programmers120834();
        System.out.println(test.solution(23));
    }
}
