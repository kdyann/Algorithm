package practice;

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c - 0 >= 'a' && c - 0 <= 'z'){
                sb.append((char)((c - 'a' + 13) % 26 + 'a'));
            } else if(c - 0 >= 'A' && c - 0 <= 'Z'){
                sb.append((char)((c - 'A' + 13) % 26 + 'A'));
            } else{
                sb.append(c);
            }
        }
        System.out.print(sb);
    }
}