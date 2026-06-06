import java.util.*;
import java.io.*;
public class Main {
    static int n,m;
    static ArrayDeque<Character> lDeque, rDeque;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        lDeque = new ArrayDeque<>();
        rDeque = new ArrayDeque<>();

        String bread = br.readLine();

        for(int i = 0; i < bread.length(); i++){
            char c = bread.charAt(i);
            lDeque.addLast(c);
        }

        while(m-- > 0){
            String recipt = br.readLine();

            if(recipt.startsWith("P")){
                char c = recipt.charAt(2);
                lDeque.addLast(c);
            }else if(recipt.startsWith("L")){
                if(!lDeque.isEmpty()){
                    rDeque.addFirst(lDeque.pollLast());
                }
            }else if(recipt.startsWith("R")){
                if(!rDeque.isEmpty()){
                    lDeque.addLast(rDeque.pollFirst());
                }
            }else if(recipt.startsWith("D")){
                if(!rDeque.isEmpty()){
                    rDeque.pollFirst();
                }
            }
        }
        while(!lDeque.isEmpty()){
            System.out.print(lDeque.pollFirst());
        }
        while(!rDeque.isEmpty()){
            System.out.print(rDeque.pollFirst());
        }
        
    }
}