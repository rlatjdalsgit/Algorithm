package Algorithm.BOJ.silver.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        sb.append('<');
        for(int i =1;i<=a;i++){
            queue.add(i);
        }

        while(!queue.isEmpty()){
            for(int i=0;i<k-1;i++){
                int n = queue.poll();
                queue.add(n);
            }
            ans.add(queue.poll());
        }
        while(!ans.isEmpty()){
            int n = ans.poll();
            if(ans.isEmpty()){
                sb.append(n).append(">");
            }else{
                sb.append(n).append(", ");
            }
        }
        System.out.println(sb);



    }
}
