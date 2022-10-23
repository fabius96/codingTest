package programmers;

/* 숨어있는 숫자의 덧셈 (1) */
public class Programmers120851 {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) answer+= Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120851 test = new Programmers120851();
        System.out.println(test.solution("aAb1B2cC34oOp"));
    }
}
