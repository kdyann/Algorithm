package solve.누적합과구현;
import java.io.*;

//한국이 그리울 땐 서버에 접속하지
public class BOJ9996 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String pattern = br.readLine();
        int idx = pattern.indexOf("*");

        String start = pattern.substring(0, idx);
        String last = pattern.substring(idx + 1);

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            boolean isOkay = true;

            if(s.length() < start.length() + last.length()){
                isOkay = false;
            }
            if(isOkay){
                for(int j = 0; j < start.length(); j++){
                    if(s.charAt(j) != start.charAt(j)){
                        isOkay = false;
                        break;
                    }
                }
            }
            if(isOkay){
                int cnt = s.length() - 1;
                for(int j = last.length() - 1; j >= 0; j--){
                    if(s.charAt(cnt--) != last.charAt(j)){
                        isOkay = false;
                        break;
                    }
                }
            }
            if(isOkay){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }

        // 다른 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String pattern2 = br.readLine();
        
        int pos = pattern2.indexOf("*");
        String pre = pattern2.substring(0, pos);
        String suf = pattern2.substring(pos+1);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            String s = br.readLine();

            if(pre.length() + suf.length() > s.length()){
                sb.append("NE\n");
            } else if(s.startsWith(pre) && s.endsWith(suf)){
                sb.append("DA\n");
            } else{
                sb.append("NE\n");
            }
        }

        System.out.print(sb);


    }
}