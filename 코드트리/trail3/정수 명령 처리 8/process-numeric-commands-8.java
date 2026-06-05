import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> ls = new LinkedList<>();

        for(int i = 0; i < n; i++){
            String command = sc.next();
            if(command.equals("push_front")){
                int x = sc.nextInt();
                ls.addFirst(x);
            }else if(command.equals("push_back")){
                int x = sc.nextInt();
                ls.addLast(x);
            }else if(command.equals("pop_front")){
                System.out.println(ls.pollFirst());
            }else if(command.equals("pop_back")){
                System.out.println(ls.pollLast());
            }else if(command.equals("size")){
                System.out.println(ls.size());
            }else if(command.equals("empty")){
                if(ls.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(command.equals("front")){
                System.out.println(ls.peekFirst());
            }else{
                System.out.println(ls.peekLast());
            }
        }
    }
}