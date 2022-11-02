package programmers;

/* 중복된 문자 제거 */
public class Programmers120888 {
    public String solution(String my_string) {
        String answer = String.valueOf(my_string.charAt(0));

        for (int i = 0; i < my_string.length(); i++) {
            boolean exist = false;
            for (int j = 0; j < answer.length(); j++) {
                if (my_string.charAt(i) == answer.charAt(j)) {
                    exist = true;
                    break;
                }
            }
            if (!exist) answer += String.valueOf(my_string.charAt(i));
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120888 test = new Programmers120888();
        System.out.println(test.solution("people"));
    }
}
