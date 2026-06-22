import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if (command.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            }
            else if (command.equals("pop")) {
                sb.append(stack.pop()).append("\n");
            }
            else if (command.equals("size")) {
                sb.append(stack.size()).append("\n");
            }
            else if (command.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            }
            else if (command.equals("top")) {
                sb.append(stack.peek()).append("\n");
            }
        }

        System.out.print(sb);
    }
}