package solve.누적합과구현;

import java.util.*;
import java.io.*;

//트럭주차
//counting
public class BOJ2979{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[102];

        for(int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j = start; j < end; j++){
                arr[j]++;
            }
        }

        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(arr[i] == 1){
                sum += a;
            } else if(arr[i] == 2){
                sum += b;
            } else if(arr[i] == 3){
                sum += c;
            }
        }
        
        System.out.println(sum);
    }
}