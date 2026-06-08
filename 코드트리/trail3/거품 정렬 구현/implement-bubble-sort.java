import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] arr = new int[a];

        for(int i = 0; i < a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < a - 1; i++){
            for(int j = 0; j < a -1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for(int i = 0; i < a; i++){
            System.out.print(arr[i] + " ");
        }
    }
}