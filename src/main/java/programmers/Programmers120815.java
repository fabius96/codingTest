package programmers;

/* 피자 나눠 먹기 (2) */
public class Programmers120815 {
    public int solution(int n) {
        int tmp = 0;
        for (int i = 1; i < n + 6; i++) {
            tmp = n * i;
            if (tmp % 6 == 0) break;
        }
        System.out.println(tmp);
        return tmp / 6;
    }

    public static void main(String[] arg) {
        Programmers120815 test = new Programmers120815();
        System.out.println(test.solution(1));
    }
}
