package programmers;

/* 공 던지기 */
public class Programmers120843 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < numbers.length; i += 2) {
            answer = numbers[i];

            if (i + 2 == numbers.length) i = -2;
            else if (i + 2 > numbers.length - 1) i = -1;
            cnt++;
            if (cnt == k) break;
        }

        return answer;
    }

    public static void main(String[] arg) {
        Programmers120843 test = new Programmers120843();
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(test.solution(array, 5));
    }
}
