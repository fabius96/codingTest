package programmers;

/* 최댓값 만들기 (2) */
public class Programmers120862 {
    public int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > answer) answer = numbers[i] * numbers[j];
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120862 test = new Programmers120862();
        int[] numbers = {0, -31, 24, 10, 1, 9};
        System.out.println(test.solution(numbers));
    }
}
