package programmers;

/* 머쓱이보다 키 큰 사람 */
public class Programmers120585 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i : array){
            if(height < i) answer ++;
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120585 test = new Programmers120585();
        int[] array = {149, 180, 192, 170};
        System.out.println(test.solution(array, 167));
    }
}
