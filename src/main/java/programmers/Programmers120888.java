package programmers;

/* 중복된 문자 제거 */
public class Programmers120888 {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (i == my_string.indexOf(my_string.charAt(i))) answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120888 test = new Programmers120888();
        System.out.println(test.solution("people"));
    }
}
