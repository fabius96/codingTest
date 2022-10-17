package programmers;

public class Programmers120814 {
    public int solution(int n) {
        int answer = n/7;
        if(n%7 > 0) answer ++;
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120814 test = new Programmers120814();
        System.out.println(test.solution(15));
    }
}
