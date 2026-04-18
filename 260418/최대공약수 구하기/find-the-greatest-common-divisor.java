import java.util.Scanner;
public class Main {
    public static void calGcd(int n, int m){
        int gcd = 0;
        for(int i = 1; i <= Math.min(n,m);i++){
            if(n%i == 0 && m%i == 0){
                gcd = i;
            }
        }
        System.out.print(gcd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        calGcd(n,m);
    }
}