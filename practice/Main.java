package practice;

import java.io.*;
import java.util.*;

public class Main{

    static int n;
    static int m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer, String> numMap = new HashMap<>();

        for(int i = 1; i <= n; i++){
            String name = br.readLine();
            nameMap.put(name, i);
            numMap.put(i, name);
        }
        for(int i = 0; i < m; i++){
            String input = br.readLine();
            try{
                int key = Integer.parseInt(input);
                System.out.println(numMap.get(key));
            }catch(Exception e){
                System.out.println(nameMap.get(input));
            }
        }


    }
}