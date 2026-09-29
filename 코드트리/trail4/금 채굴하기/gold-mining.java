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

        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve();

        System.out.println(answer);
    }

    private static void solve() {

        // 모든 칸을 중심으로 확인
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                // 가능한 모든 K 확인
                for (int k = 0; ; k++) {

                    int cost = k * k + (k + 1) * (k + 1);

                    // 비용이 최대 수익보다 크면 더 이상 볼 필요 X
                    if (cost > n * n * m) {
                        break;
                    }

                    check(r, c, k, cost);
                }
            }
        }
    }

    private static void check(int r, int c, int k, int cost) {

        int gold = 0;

        // 격자의 모든 칸을 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // 중심에서 현재 칸까지의 맨해튼 거리
                int distance = Math.abs(r - i) + Math.abs(c - j);

                // 마름모 안에 있으면
                if (distance <= k) {
                    gold += arr[i][j];
                }
            }
        }

        if (gold * m >= cost) {
            answer = Math.max(answer, gold);
        }
    }
}