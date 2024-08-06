package Algorithm.BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
        int N = Integer.parseInt(br.readLine());

        String[] Sarr = br.readLine().split(" ");

        int[] arr = new int[N];
        int[] sorted = new int[N];

        for(int i=0;i<N;i++){
            arr[i]=sorted[i]=Integer.parseInt(Sarr[i]);
        }

        Arrays.sort(sorted);

        int rank =0;

        for(int key : sorted){
            if(!rankMap.containsKey(key)){
                rankMap.put(key, rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int key : arr){
            sb.append(rankMap.get(key)).append(' ');
        }
        System.out.println(sb);




    }
}
