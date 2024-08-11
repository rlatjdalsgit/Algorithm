package Algorithm.BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i =0 ; i<a;i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i =0 ; i<b;i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int ans = 0;

        for(int num : setA){
            if(!setB.contains(num)){
                ans+=1;
            }
        }

        for(int num : setB){
            if(!setA.contains(num)){
                ans+=1;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ans);
        System.out.println(sb);
    }
}
