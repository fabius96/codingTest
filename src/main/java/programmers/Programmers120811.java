package programmers;

import java.util.Arrays;

/* 중앙값 구하기 */
public class Programmers120811 {
    public int solution(int[] array) {
        Arrays.sort(array);;
        int mid = array.length/2;
        return array[mid];
    }

    public static void main(String[] arg) {
        Programmers120811 test = new Programmers120811();
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(test.solution(array));
    }
}
