package programmers;

/* 가위 바위 보 */
public class Programmers120839 {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            if (String.valueOf(rsp.charAt(i)).equals("2")) {
                answer.append("0");
            } else if (String.valueOf(rsp.charAt(i)).equals("0")) {
                answer.append("5");
            } else answer.append("2");
        }
        return answer.toString();
    }

    public static void main(String[] arg) {
        Programmers120839 test = new Programmers120839();
        System.out.println(test.solution("205"));
    }
}
