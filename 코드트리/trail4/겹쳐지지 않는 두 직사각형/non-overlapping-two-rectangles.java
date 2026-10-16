import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] arr;
    static int[][] prefix;
    static int answer = Integer.MIN_VALUE;

    static ArrayList<Rectangle> rectangles = new ArrayList<>();

    static class Rectangle {
        int x1, y1, x2, y2;
        int sum;

        Rectangle(int x1, int y1, int x2, int y2, int sum) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.sum = sum;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        prefix = new int[N + 1][M + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        makePrefixSum();
        makeRectangles();
        findAnswer();

        System.out.println(answer);
    }

    static void makePrefixSum() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                prefix[i][j] =
                    arr[i - 1][j - 1]
                    + prefix[i - 1][j]
                    + prefix[i][j - 1]
                    - prefix[i - 1][j - 1];
            }
        }
    }

    static void makeRectangles() {
        for (int x1 = 0; x1 < N; x1++) {
            for (int y1 = 0; y1 < M; y1++) {
                for (int x2 = x1; x2 < N; x2++) {
                    for (int y2 = y1; y2 < M; y2++) {
                        int sum = getSum(x1, y1, x2, y2);

                        rectangles.add(
                            new Rectangle(x1, y1, x2, y2, sum)
                        );
                    }
                }
            }
        }
    }

    static int getSum(int x1, int y1, int x2, int y2) {
        return prefix[x2 + 1][y2 + 1]
            - prefix[x1][y2 + 1]
            - prefix[x2 + 1][y1]
            + prefix[x1][y1];
    }

    static boolean isOverlapping(Rectangle a, Rectangle b) {
        if (a.x2 < b.x1 || b.x2 < a.x1 ||
            a.y2 < b.y1 || b.y2 < a.y1) {
            return false;
        }

        return true;
    }

    static void findAnswer() {
        int size = rectangles.size();

        for (int i = 0; i < size; i++) {
            Rectangle a = rectangles.get(i);

            for (int j = i + 1; j < size; j++) {
                Rectangle b = rectangles.get(j);

                if (!isOverlapping(a, b)) {
                    answer = Math.max(answer, a.sum + b.sum);
                }
            }
        }
    }
}