import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        boolean isValid = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            isValid = false;
        }

        System.out.println(isValid ? "Yes" : "No");
    }
}