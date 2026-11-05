package practice;

import java.io.*;
import java.util.*;

public class Main{

    static int n;
    static int k;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] psum = new int[n + 1];
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i < n; i++){
            int temp = Integer.parseInt(st.nextToken());
            psum[i] = psum[i - 1] + temp;
        }

        int ret = Integer.MIN_VALUE;

        for(int i = k; i <= n; i++){
            int sum = psum[i] - psum[i - k];
            ret = Math.max(ret, sum);
        }
        
        System.out.println(ret);
    }
}