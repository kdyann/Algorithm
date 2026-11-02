package solve.누적합과구현;

import java.io.*;

//농구 경기
public class BOJ1159 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            char c = s.charAt(0);
            arr[c - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] >= 5){
                sb.append((char)(i + 'a'));
            }
        }

        if(sb.length() > 0){
            System.out.println(sb);
        } else{
            System.out.println("PREDAJA");
        }
    }
}