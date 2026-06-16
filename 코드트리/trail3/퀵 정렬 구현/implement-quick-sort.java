import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static int[] arr;

    public static void quickSort(int low, int high){
        if(low >= high) return;

        int pivotIndex = partition(low, high);

        quickSort(low, pivotIndex - 1);
        quickSort(pivotIndex + 1, high);
    }
    public static int partition(int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++;
                swap(i,j);
            }
        }
        swap(i+1, high);
        return i+1;
    }
    public static void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }       

        quickSort(0,n-1);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}