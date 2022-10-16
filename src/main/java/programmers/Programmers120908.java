package programmers;

public class Programmers120908 {
    public int solution(String str1, String str2) {
        int answer = 2;
        if (str1.contains(str2)) answer = 1;
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120908 test = new Programmers120908();
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "ppprrrogrammers";
        System.out.println(test.solution(str1, str2));
    }
}
