package programmers;

/* 특정 문자 제거하기 */
public class Programmers120826 {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }


    public static void main(String[] arg) {
        Programmers120826 test = new Programmers120826();
        System.out.println(test.solution("abcdef", "f"));
    }
}
