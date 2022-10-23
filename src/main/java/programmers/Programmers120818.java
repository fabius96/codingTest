package programmers;

/* 옷가게 할인 받기 */
public class Programmers120818 {
    public int solution(int price) {
        int answer = price;
        if (price >= 500000) {
            answer = (int) (price * 0.8);
        } else if (price >= 300000) {
            answer = (int) (price * 0.9);

        } else if (price >= 100000) {
            answer = (int) (price * 0.95);
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120818 test = new Programmers120818();
        System.out.println(test.solution(150000));
    }
}
