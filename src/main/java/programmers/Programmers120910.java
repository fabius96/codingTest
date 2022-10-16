package programmers;

public class Programmers120910 {
    public int solution(int n, int t) {
        int answer = n;
        for(int i = 0; i < t ; i++){
            answer = answer * 2;
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120910 test = new Programmers120910();
        System.out.println(test.solution(7, 15));
    }
}
