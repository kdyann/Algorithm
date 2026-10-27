package practice;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n+1];
        int[] psum = new int[n+1];

        st = new StringTokenizer(br.readLine());

        //누적합 구하기
        for(int i = 1; i <= n; i++){
            a[i] = Integer.parseInt(st.nextToken());
            psum[i] = psum[i-1] + a[i];
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());

            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            sb.append(psum[c] - psum[b-1]).append("\n");
        }
        System.out.print(sb);
    }
    
}
