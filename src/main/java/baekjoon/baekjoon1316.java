package baekjoon;

import java.io.*;
import java.util.ArrayList;

/* 그룹 단어 체커 */
public class baekjoon1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cycle = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < cycle; i++) {
            answer++;
            String word = br.readLine();
            ArrayList<String> alphabets = new ArrayList<>();
            for (int j = 0; j < word.length(); j++) {
                String alphabet = String.valueOf(word.charAt(j));
                if (!alphabets.contains(alphabet)) alphabets.add(alphabet);
                else if(!String.valueOf(word.charAt(j-1)).equals(alphabet)) {
                    answer--;
                    break;
                }
            }
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
