package programmers;

/* 삼각형의 완성조건(1) */
public class Programmers120889 {
    public int solution(int[] sides) {
        int answer = 1;
        int sum = 0;
        int longest = 0;
        for (int i : sides) {
            sum += i;
            if (longest < i) {
                longest = i;
            }
        }
        if (longest >= sum - longest) answer = 2;

        return answer;
    }

    public static void main(String[] arg) {
        Programmers120889 test = new Programmers120889();
        int[] side = {1, 2, 3};
        System.out.println(test.solution(side));
    }
}
