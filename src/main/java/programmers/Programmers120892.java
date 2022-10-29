package programmers;

/* 암호 해독 */
public class Programmers120892 {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code - 1; i < cipher.length(); i = i + code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120892 test = new Programmers120892();
        System.out.println(test.solution("dfjardstddetckdaccccdegk", 4));
    }
}
