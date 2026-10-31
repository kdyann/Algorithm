package solve.누적합과구현;

import java.util.*;
import java.io.*;

public class combination {

    static int n, k;
    static StringBuilder sb = new StringBuilder();

    static void combi(int start, ArrayList<Integer> b){

        if(b.size() == k){
            for(int num : b){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start + 1; i < n; i++){
            b.add(i);
            combi(i,b);
            b.remove(b.size() - 1);
        }
    }
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        combi(-1, new ArrayList<>());

        System.out.print(sb);
    
    }
}
