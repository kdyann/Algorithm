package solve.누적합과구현;

import java.io.*;
import java.util.*;
//패션왕
//경우의 수
public class BOJ9375 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int test = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for(int j = 0; j < test; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String kind = st.nextToken();
                map.put(kind, map.getOrDefault(kind,0) + 1);
            }
            int result = 1;
            for(Integer value : map.values()){
                result *= (value + 1);
            }
            System.out.println(result - 1);
        }
    }
}