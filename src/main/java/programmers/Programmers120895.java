package programmers;

/* 인덱스 바꾸기 */
public class Programmers120895 {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                answer.append(my_string.charAt(num2));
            } else if (i == num2) {
                answer.append(my_string.charAt(num1));
            } else answer.append(my_string.charAt(i));

        }
        return answer.toString();
    }

    public static void main(String[] arg) {
        Programmers120895 test = new Programmers120895();
        System.out.println(test.solution("hello", 1, 2));
    }
}
