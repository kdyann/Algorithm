package solve.누적합과구현;
import java.io.*;
//ROT13
public class BOJ11655 {
// 65->A 97->a
// O -> B = -26 해주기
// 대문자는 대문자끼리 소문자는 소문자끼리
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            //소문자
            if(c >= 'a' && c <= 'z'){
                sb.append((char)((c - 'a' + 13) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z'){ //대문자
                sb.append((char)((c - 'A' + 13) % 26 + 'A'));
            } else{
                sb.append(c);
            }

        }

        System.out.print(sb);
        
    }
}