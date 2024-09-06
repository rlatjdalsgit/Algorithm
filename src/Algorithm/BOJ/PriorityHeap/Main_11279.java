package Algorithm.BOJ.PriorityHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i =0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                if(queue.size()==0){
                    sb.append(0).append('\n');
                }else{
                    sb.append(queue.poll()).append('\n');
                }
            }else{
                queue.offer(num);
            }

        }
        System.out.println(sb);

    }
}
