import java.util.*;
import java.io.*;
  
public class Main {

    static int n, m;
    static int[][] arr;

    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][n];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = 0;
        
        for(int i = 0; i < n; i++){
            if(isHappyRow(i)){
                answer++;
            }
        }

        for(int j = 0; j < n; j++){
            if(isHappyColumn(j)){
                answer++;
            }
        }

        System.out.println(answer);
        
    }

    private static boolean isHappyRow(int row){
        int count = 1;

        for(int j = 0; j < n-1; j++){
            if(arr[row][j] == arr[row][j+1]){
                count++;
            }else{
                count = 1;
            }
            if(count >= m){
                return true;
            }
        }
        return m == 1;
    }

    private static boolean isHappyColumn(int col){
        int count = 1;

        for(int i = 0; i < n-1; i++){
            if(arr[i][col] == arr[i+1][col]){
                count++;
            }else{
                count = 1;
            }
            if(count >= m){
                return true;
            }
        }
        return m == 1;
    }
}