package baekjoon;

import java.io.*;
import java.util.HashSet;

/* 인사성 밝은 곰곰이 */
// https://www.acmicpc.net/problem/25192
public class baekjoon25192 {
    public int solution(int n, String[] arr){
        int answer = 0;
        HashSet<String> hashSet = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(arr[i].equals("ENTER"))hashSet.clear();
            else if (!hashSet.contains(arr[i])){
                hashSet.add(arr[i]);
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args)throws IOException{
        baekjoon25192 T = new baekjoon25192();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 입력 수
        String[] arr = new String[n];
        for(int i =0; i <n;i++){
            String str = br.readLine();
            arr[i] = str;
        }
        bw.write(T.solution(n, arr) + "\n");
        bw.flush();
        bw.close();
    }
}
