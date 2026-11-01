package solve.누적합과구현;

import java.io.*;
//팰린드롬인지 확인하기
//reverse
public class BOJ10988 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        boolean ispal = true;

        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                ispal = false;
                break;
            }
        }

        if(ispal){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        //아니면 reverse로 비교하기 
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String s = br.readLine();

        String reversed = new StringBuilder(s).reverse().toString();

        if(s.equals(reversed)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    
    }
}



