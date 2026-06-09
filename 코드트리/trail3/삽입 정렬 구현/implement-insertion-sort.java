import java.util.*;
import java.io.*;
public class Main {

    static int n;
    static int[] arr;


    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i < n; i++) {
        int findIdx = i;

        for(int j = 0; j < i; j++) {
            if(arr[i] < arr[j]) {
                findIdx = j;
                break;
            }
        }

        for(int j = i; j > findIdx; j--) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
        }
    }   
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}