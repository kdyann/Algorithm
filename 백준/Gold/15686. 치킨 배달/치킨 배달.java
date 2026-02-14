import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static List<Node> homes;
    static List<Node> chickens;
    static List<Node> selectChickens;
    static int ret;

    static class Node {
        int y;
        int x;

        Node(int y, int x) {
            this.y = y;
            this.x = x;
        }

        int findDis(Node node) {
            return Math.abs(this.y - node.y) + Math.abs(this.x - node.x);
        }
    }

    static void go(int start) {
        if (selectChickens.size() == M) {
            findChickenStreet();
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            selectChickens.add(chickens.get(i));
            go(i + 1);
            selectChickens.remove(chickens.get(i));
        }
    }

    static void findChickenStreet() {
        int thisRet = 0;
        for (int i = 0; i < homes.size(); i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < selectChickens.size(); j++) {
                min = Math.min(min, homes.get(i).findDis(selectChickens.get(j)));
            }
            thisRet += min;
        }
        ret = Math.min(thisRet, ret);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        homes = new ArrayList<>();
        chickens = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            StringTokenizer line = new StringTokenizer(bf.readLine());
            for (int j = 1; j <= N; j++) {
                int num = Integer.parseInt(line.nextToken());
                if (num == 1) {
                    homes.add(new Node(i, j));
                } else if (num == 2) {
                    chickens.add(new Node(i, j));
                }
            }
        }
        selectChickens = new ArrayList<>();
        ret = Integer.MAX_VALUE;
        go(0);

        System.out.println(ret);
    }

}