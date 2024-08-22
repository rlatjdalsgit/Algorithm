package Algorithm.BOJ.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15651 {
    static int n;
    static int m;
    static  boolean[] visit;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visit=new boolean[n];//그 숫자를 썼는지
        arr=new int[m];//완성해 나갈 수열

        dfs(0);
        System.out.println(sb);

    }
    static void dfs(int depth){
        if(depth==m){
            for(int a : arr){
                sb.append(a).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i=0;i<n;i++){
//            if(!visit[i]){
//                visit[i]=true;
                arr[depth]=i+1;
                dfs(depth+1);
//                visit[i]=false;
//            }

        }

    }
}
