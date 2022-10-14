package programmers;

public class Programmers120830 {
    public int solution(int n, int k) {
        int answer = 0;
        /* int n은 양꼬치 1인분 가격 12,000원*/
        /* int k은 음료수 2,000원(양꼬치 10인분당 1개 무료)*/
        answer = 12000 * n + 2000 * k - (n/10*2000);
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120830 test = new Programmers120830();
        System.out.println(test.solution(10, 3));
    }
}
