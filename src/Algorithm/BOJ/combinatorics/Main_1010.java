package Algorithm.BOJ.combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1010 {
    static int[][] arr = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0 ; i<num;i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(comb(m, n)).append('\n');
        }

        System.out.println(sb);
    }

    static int comb(int n, int m){
        if(arr[n][m]>0){
            return arr[n][m];
        }
        if(n==m||m==0){
            return arr[n][m]=1;
        }

        return arr[n][m]=comb(n-1, m-1)+comb(n-1,m);

    }
}
