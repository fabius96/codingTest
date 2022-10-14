package programmers;

public class Programmers120817 {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int x : numbers) {
            answer += x;
        }
       answer = answer/numbers.length;

        return answer;
    }

    public static void main(String[] arg) {
        Programmers120817 test = new Programmers120817();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(test.solution(numbers));
    }
}
