import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());

        int b1 = B % 10;
        int b10 = (B/10) % 10;
        int b100 = B/100;
        
        System.out.println(A*b1);
        System.out.println(A*b10);
        System.out.println(A*b100);
        System.out.println(A*B);

    }
}