package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

/* 걸그룹 마스터 준석이 */
// https://www.acmicpc.net/problem/16165
public class baekjoon16165 {
    /*  */
    public String[] type0(HashMap<String, String> hashMap, String name) {
        ArrayList<String> girlGroup = new ArrayList<>();
        for (String str : hashMap.keySet()) {
            if (hashMap.get(str).equals(name)) girlGroup.add(str);
        }
        Collections.sort(girlGroup);
        return girlGroup.toArray(new String[0]);
    }

    public String type1(HashMap<String, String> hashMap, String name) {
        String answer = hashMap.get(name);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        baekjoon16165 T = new baekjoon16165();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 입력 받을 걸그룹 수
        int m = Integer.parseInt(st.nextToken()); // 맞혀야 할 문제의 수
        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String groupName = br.readLine();
            int memberNum = Integer.parseInt(br.readLine());
            for (int j = 0; j < memberNum; j++) {
                String memberName = br.readLine();
                hashMap.put(memberName, groupName);
            }
        }


        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            int num = Integer.parseInt(br.readLine());
            if (num == 0) for (String str : T.type0(hashMap, name)) bw.write(str + "\n");
            if (num == 1) bw.write(T.type1(hashMap, name) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
