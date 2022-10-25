package programmers;

/* 숫자 찾기 */
public class Programmers120904 {
    public int solution(int num, int k) {
        int answer = 0;
        String numToString = String.valueOf(num);
        for (int i = 0; i < numToString.length(); i++) {
            answer++;
            if (Integer.parseInt(String.valueOf(numToString.charAt(i))) == k) break;
            if (i == numToString.length() - 1) answer = -1;
        }
        return answer;
    }

    public static void main(String[] arg) {
        Programmers120904 test = new Programmers120904();
        System.out.println(test.solution(29183, 1));
    }
}
