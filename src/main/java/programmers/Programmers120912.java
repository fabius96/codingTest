package programmers;

/* 7의 개수 */
public class Programmers120912 {
    public int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            String str = String.valueOf(i);
            for (int num = 0; num < str.length(); num++) {
                if (Integer.parseInt(String.valueOf(str.charAt(num))) == 7) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120912 test = new Programmers120912();
        int[] array = {7, 77, 17};
        System.out.println(test.solution(array));
    }
}
