import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] arr;
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve();

        System.out.println(answer);
    }

    private static void solve() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                check(i, j);
            }
        }
    }

    private static void check(int r, int c) {

        // 가로 3칸
        if (c + 2 < m) {
            int sum = arr[r][c] + arr[r][c + 1] + arr[r][c + 2];
            answer = Math.max(answer, sum);
        }

        // 세로 3칸
        if (r + 2 < n) {
            int sum = arr[r][c] + arr[r + 1][c] + arr[r + 2][c];
            answer = Math.max(answer, sum);
        }

        // 3. ㄴ자 
        if (r + 1 < n && c + 1 < m) {

            int a = arr[r][c];
            int b = arr[r][c + 1];
            int c1 = arr[r + 1][c];
            int d = arr[r + 1][c + 1];

            int sum = a + b + c1 + d;

            int min = Math.min(
                    Math.min(a, b),
                    Math.min(c1, d)
            );

            sum -= min;

            answer = Math.max(answer, sum);
        }
    }
}