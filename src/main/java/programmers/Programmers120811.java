package programmers;

import java.util.ArrayList;
import java.util.Collections;

/* 중앙값 구하기 */
public class Programmers120811 {
    public int solution(int[] array) {
        int mid = array.length/2;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i : array){
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        return arrayList.get(mid);
    }

    public static void main(String[] arg) {
        Programmers120811 test = new Programmers120811();
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(test.solution(array));
    }
}
