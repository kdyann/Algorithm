package solve.누적합과구현;
import java.io.*;
//counting 배열
public class BOJ1213 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] cnt = new int[26];

        for(int i = 0; i < s.length(); i++){
            cnt[s.charAt(i) - 'A']++;
        }

        int oddCount = 0; //개수가 홀수인 문자의 종류 수
        char mid = '\0'; //가운데에 넣을 문자
        for(int i = 0; i < 26; i++){
            if(cnt[i] % 2 == 1){ //개수가 홀수인지 확인하는 조건
                mid = (char) (i + 'A'); //배열 인덱스를 다시 문자로 바꿈
                oddCount++;
            }
        }
        if(oddCount >= 2){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder left = new StringBuilder();

        for(int i = 0; i < 26; i++){
            for(int j = 0; j < cnt[i] / 2; j++){
                left.append((char) (i + 'A'));
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