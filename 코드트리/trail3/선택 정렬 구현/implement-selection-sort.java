import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[a];

        for(int i = 0; i < a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < a; i++){
            int min = i;
            //뒤부터 탐색
            for(int j = i; j < a;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp; 

        }

        for(int i = 0; i < a; i++){
            System.out.print(arr[i] + " ");
        }
        

        
    }
}