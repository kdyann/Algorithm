import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st1 = new StringTokenizer(bf.readLine());

       int num = Integer.parseInt(st1.nextToken());
       StringTokenizer st2 = new StringTokenizer(bf.readLine());
       int[] a = new int[num];
       for(int i = 0; i < num; i++){
            a[i] =Integer.parseInt(st2.nextToken());
       }
       for(int i = 0; i < num; i++){
            a[i] = a[i]*a[i];
       }
       for(int i = 0; i < num; i++){
            System.out.print(a[i]+" ");
       }



    }
}