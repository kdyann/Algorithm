import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String[] a = new String[10];

        for(int i = 0; i < 10; i++){
            a[i] = st.nextToken();
        }

        for(int i = 9; i >= 0 ; i--){
            System.out.print(a[i]);
        }

     

    }
}