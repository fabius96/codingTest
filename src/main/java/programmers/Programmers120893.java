package programmers;

/* 대문자와 소문자 */
public class Programmers120893 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) answer += Character.toLowerCase(my_string.charAt(i));
            else answer += Character.toUpperCase(my_string.charAt(i));
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120893 test = new Programmers120893();
        System.out.println(test.solution("cccCCC"));
    }
}
