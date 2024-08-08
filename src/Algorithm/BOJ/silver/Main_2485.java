package Algorithm.BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i<N ;i++){
            int a = Integer.parseInt(br.readLine());
            arr[i]=a;
        }

        int calced=0;
        for(int i=0;i<N-1;i++){
            int dist = arr[i+1]-arr[i];
            calced=calc(dist, calced);
        }

        int total_dist = arr[N-1]-arr[0];
        int ans = total_dist/calced+1;
        StringBuilder sb = new StringBuilder();
        sb.append(ans-arr.length);
        System.out.println(sb);
    }
    static int calc(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
