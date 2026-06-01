import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String cmd = sc.next();
            if(cmd.equals("push_back")){
                int x = sc.nextInt();
                arr.add(x);
            }
            else if(cmd.equals("pop_back")){
                arr.remove(arr.size() - 1);
            }
            else if(cmd.equals("size")){
                System.out.println(arr.size());
            }
            else if(cmd.equals("get")){
                int k = sc.nextInt();
                System.out.println(arr.get(k-1));
            }
        }
        sc.close();
    }
}