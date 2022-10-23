package programmers;

/* 모음 제거 */
public class Programmers120849 {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

    public static void main(String[] arg) {
        Programmers120849 test = new Programmers120849();
        System.out.println(test.solution("nice to meet you"));
    }
}
