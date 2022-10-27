package programmers;

/* 주사위의 개수 */
public class Programmers120845 {
    public int solution(int[] box, int n) {
        int answer = 1;
        for (int i : box) {
            answer *= i / n;
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120845 test = new Programmers120845();
        int[] box = {10, 8, 6};
        System.out.println(test.solution(box, 3));
    }
}
