package practice;

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] cnt = new int[26];

        for(int i = 0; i < s.length(); i++){
            cnt[s.charAt(i) - 'A']++;
        }
        int oddCount = 0;
        char mid = '\0';

        for(int i = 0; i < 26; i++){
            if(cnt[i] % 2 == 1){
                mid = (char)(i + 'A');
                oddCount++;
            }
        }
        if(oddCount >= 2){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder left = new StringBuilder();

        for(int i = 0; i < 26; i++){
            for(int j = 0; j < cnt[i]/2; j++){
                left.append((char)(i + 'A'));
            }
        }
        StringBuilder result = new StringBuilder();
        result.append(left);
        if(oddCount == 1){
            result.append(mid);
        }
        result.append(left.reverse());
        System.out.println(result);
    }
}