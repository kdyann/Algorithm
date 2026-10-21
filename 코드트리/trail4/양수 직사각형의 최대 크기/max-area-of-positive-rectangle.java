import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] arr;
    static int answer = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        findMaxRectangle();

        System.out.println(answer);
    }

    static void findMaxRectangle() {
        for (int x1 = 0; x1 < N; x1++) {
            for (int y1 = 0; y1 < M; y1++) {
                for (int x2 = x1; x2 < N; x2++) {
                    for (int y2 = y1; y2 < M; y2++) {

                        if (isPositive(x1, y1, x2, y2)) {
                            int height = x2 - x1 + 1;
                            int width = y2 - y1 + 1;

                            int area = height * width;

                            answer = Math.max(answer, area);
                        }
                    }
                }
            }
        }
    }

    static boolean isPositive(int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if (arr[i][j] <= 0) {
                    return false;
                }
            }
        }

        return true;
    }
}