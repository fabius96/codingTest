package programmers;

public class Programmers120841 {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else
            answer = 2;
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120841 test = new Programmers120841();
        int[] dot = {2, -4};
        System.out.println(test.solution(dot));
    }
}
