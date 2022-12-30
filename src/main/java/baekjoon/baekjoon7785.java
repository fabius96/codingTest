package baekjoon;

import java.io.*;
import java.util.*;

/* 회사에 있는 사람 */
// https://www.acmicpc.net/problem/7785
public class baekjoon7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 출근 기록 수
        StringTokenizer st;
        HashSet<String> workList = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken(); // 이름
            String state = st.nextToken(); // 출근, 퇴근 여부
            if(state.equals("enter"))workList.add(name);
            if(state.equals("leave"))workList.remove(name);
        }

        Object[] answer = workList.toArray();
        Arrays.sort(answer, Collections.reverseOrder());

        for (Object o : answer) {
            bw.write(o + "\n");
        }

        bw.flush();
        bw.close();
    }
}
