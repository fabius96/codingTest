package programmers;

/* 치킨 쿠폰 */
public class Programmers120884 {
    final int BONUS_NUM = 10;

    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= BONUS_NUM) {
            int newChick = chicken / BONUS_NUM;
            int restChick = chicken % BONUS_NUM;
            chicken = newChick + restChick;

            answer += newChick;
        }

        return answer;
    }


    public static void main(String[] arg) {
        Programmers120884 test = new Programmers120884();
        System.out.println(test.solution(100));
    }
}
