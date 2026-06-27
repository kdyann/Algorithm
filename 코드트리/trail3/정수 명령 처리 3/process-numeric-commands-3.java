import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push_front")) {
                int x = Integer.parseInt(st.nextToken());
                deque.offerFirst(x);
            }
            else if (command.equals("push_back")) {
                int x = Integer.parseInt(st.nextToken());
                deque.offerLast(x);
            }
            else if (command.equals("pop_front")) {
                sb.append(deque.pollFirst()).append("\n");
            }
            else if (command.equals("pop_back")) {
                sb.append(deque.pollLast()).append("\n");
            }
            else if (command.equals("size")) {
                sb.append(deque.size()).append("\n");
            }
            else if (command.equals("empty")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            }
            else if (command.equals("front")) {
                sb.append(deque.peekFirst()).append("\n");
            }
            else if (command.equals("back")) {
                sb.append(deque.peekLast()).append("\n");
            }
        }

        System.out.print(sb);
    }
}
