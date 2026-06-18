import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;

    public static void heapify(int size, int idx) {
        int largest = idx;
        int left = idx * 2 + 1;
        int right = idx * 2 + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != idx) {
            int temp = arr[idx];
            arr[idx] = arr[largest];
            arr[largest] = temp;

            heapify(size, largest);
        }
    }

    public static void heapSort() {
        // Max Heap 생성
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(n, i);
        }

        // 정렬
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(i, 0);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        heapSort();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.print(sb);
    }
}