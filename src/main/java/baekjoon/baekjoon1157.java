package baekjoon;

import java.io.*;
import java.util.ArrayList;

/* 단어 공부 */
public class baekjoon1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine().toUpperCase();
        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (!arrayList.contains(word.charAt(i))) arrayList.add(word.charAt(i));
        }

        int[] intArray = new int[arrayList.size()];
        int maxIndex = 0;

        for (int j = 0; j < intArray.length; j++) {
            for (int i = 0; i < word.length(); i++) {
                if (arrayList.get(j) == word.charAt(i)) intArray[j] += 1;
            }
            if(intArray[j] > intArray[maxIndex]) maxIndex = j;
        }

        int tmp = 0;
        for(int i : intArray){
            if(i == intArray[maxIndex]) tmp++;
        }
        if(tmp!=1) bw.write("?" + "\n");
        else bw.write(arrayList.get(maxIndex) + "\n");
        bw.flush();
        bw.close();
    }
}
