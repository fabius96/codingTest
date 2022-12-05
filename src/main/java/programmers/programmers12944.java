package programmers;

/* 평균 구하기 */
public class programmers12944 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i : arr) {
            answer += i;
        }
        return answer / arr.length;
    }

    public static void main(String[] arg) {
        programmers12944 test = new programmers12944();
        int[] array = {1, 2, 3, 4};
        System.out.println(test.solution(array));
    }
}
