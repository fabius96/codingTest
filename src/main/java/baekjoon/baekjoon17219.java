package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

/* 비밀번호 찾기 */
// https://www.acmicpc.net/problem/17219
public class baekjoon17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 저장된 사이트 주소의 수
        int m = Integer.parseInt(st.nextToken()); // 비밀번호를 찾으려는 사이트 주소의 수

        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String siteAddress = st.nextToken();
            String password = st.nextToken();
            hashMap.put(siteAddress, password);
        }

        for (int i = 0; i < m; i++) {
            String key = br.readLine();
            bw.write(hashMap.get(key) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
