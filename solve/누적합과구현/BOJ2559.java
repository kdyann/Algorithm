package solve.누적합과구현;
import java.io.*;
import java.util.*;
//N: 1 ~ 10만
//K: 1 ~ 10만 - 1 (n 사이값)
//연속의 온도의 합이 "최대" 되는 값: 구간합 prefix sum, psum[i] = psum[i - 1] + a[i];
//최댓값을 구하라 -> 최솟값부터 최댓값 구하기
//최솟값을 구하라 -> 최댓값부터 최솟값 구하기
//이 문제의 최솟값은? -100 * (10만번) >> -1000만

public class BOJ2559 {
    
    static int n;
    static int k;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] psum = new int[n + 1];
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i < n; i++){
            int temp = Integer.parseInt(st.nextToken());
            psum[i] = psum[i - 1] + temp;
        }

        int ret = Integer.MIN_VALUE;

        for(int i = k; i <= n; i++){
            int sum = psum[i] - psum[i - k];
            ret = Math.max(ret, sum);
        }
        
        System.out.println(ret);
    }
}