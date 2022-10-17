package programmers;

public class Programmers120816 {
    public int solution(int slice, int n) {
        int answer = n/slice;
        if(n%slice > 0) answer ++;
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120816 test = new Programmers120816();
        System.out.println(test.solution(7, 10));
    }
}
