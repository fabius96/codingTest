package programmers;

/* 369 게임 */
public class Programmers120891 {
    public int solution(int order) {
        int answer = 0;
        String tmp = String.valueOf(order);
        for (int i = 0; i < tmp.length(); i++) {
            int num = Integer.parseInt(String.valueOf(tmp.charAt(i)));
            if (num == 3 || num == 6 || num == 9) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120891 test = new Programmers120891();
        System.out.println(test.solution(1000000000));
    }
}
