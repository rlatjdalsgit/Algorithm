package Algorithm.BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for(int i = 1 ; i<=N ;i++){
            String str = br.readLine();
            map1.put(i, str);
            map2.put(str, i);
        }

        for(int i=0;i<M;i++){
            String get = br.readLine();
            char chr = get.charAt(0);
            if(Character.isDigit(chr)){
                System.out.println(map1.get(Integer.parseInt(get)));
            }else{
                System.out.println(map2.get(get));

            }
        }

    }
}
