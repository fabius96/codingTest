package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

/* 수 정렬하기 2 */
public class baekjoon2751 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        ArrayList<Integer> intArrList = new ArrayList<>();

        for(int i = 0; i < cnt; i++){
            int num = Integer.parseInt(br.readLine());
            intArrList.add(num);
        }

        intArrList.sort(Comparator.naturalOrder());
        for(int i : intArrList){
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
