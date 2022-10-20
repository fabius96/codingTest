package programmers;

/* 특정 문자 제거하기 */
public class Programmers120826 {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(!letter.equals(String.valueOf(my_string.charAt(i)))){
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }


    public static void main(String[] arg) {
        Programmers120826 test = new Programmers120826();
        System.out.println(test.solution("abcdef", "f"));
    }
}
