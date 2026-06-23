import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push")){
                int x = Integer.parseInt(st.nextToken());
                q.add(x);
            }else if(command.equals("pop")){
                sb.append(q.poll()).append("\n");
            }else if(command.equals("size")){
                sb.append(q.size()).append("\n");
            }else if(command.equals("empty")){
                sb.append(q.isEmpty() ? 1 : 0).append("\n");
            }else if(command.equals("front")){
                sb.append(q.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}