package baekjoon;

import java.io.*;

/* 크로아티아 알파벳 */
public class baekjoon2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int answer = input.length();

        for (int i = 1; i < input.length(); i++) {
            String alphabet = String.valueOf(input.charAt(i));
            String before = String.valueOf(input.charAt(i - 1));

            switch (alphabet) {
                case "=":
                    if (before.equals("z")) {
                        if (i > 1 && String.valueOf(input.charAt(i - 2)).equals("d")) answer -= 2;
                        else answer--;
                    } else if (before.equals("c") || before.equals("s")) answer--;
                    break;
                case "-":
                    if (before.equals("c") || before.equals("d")) answer--;
                    break;
                case "j":
                    if (before.equals("l") || before.equals("n")) answer--;
                    break;
            }
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
