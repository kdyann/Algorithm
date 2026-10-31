package solve.누적합과구현;

import java.io.*;

//알파벳 개수
public class BOJ10808{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            char c =  s.charAt(i);
            arr[c - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            System.out.print(arr[i] + " ");
        }
    }
}