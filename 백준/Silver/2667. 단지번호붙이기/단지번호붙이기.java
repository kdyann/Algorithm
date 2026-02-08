import java.io.*;
import java.util.*;

public class Main {

    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] maps;
    static int[][] visited;
    
    static int DFS(int y, int x) {
        int amount = 1;
        visited[y][x] = 1;
        for(int i = 0; i < 4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            
            if(nx < 0 || ny < 0 || ny >= maps.length || nx >= maps[0].length || visited[ny][nx] == 1){
                continue;
            }
            if(maps[ny][nx]==1){
                amount += DFS(ny,nx);
            }
            
        }
        return amount;
    }
    
    
    
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        maps = new int[N][N];
        visited = new int[N][N];

        for (int i = 0; i < N; i++){
            String[] line = bf.readLine().split("");
            for (int j = 0; j < N; j++){
                maps[i][j] = Integer.parseInt(line[j]);
            }
        }
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < N; i++ ){
            for (int j = 0; j < N; j++){
                if(maps[i][j] == 1 && visited[i][j] == 0){
                    list.add(DFS(i,j));
                    cnt++;
                }
                
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}