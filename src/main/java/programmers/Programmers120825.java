package programmers;

/* 문자 반복 출력하기 */
public class Programmers120825 {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int t = 0; t < n; t++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120825 test = new Programmers120825();
        System.out.println(test.solution("hello", 3));
    }
}
