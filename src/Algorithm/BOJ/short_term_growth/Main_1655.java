package Algorithm.BOJ.short_term_growth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main_1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());

            if(minHeap.size()==maxHeap.size()){
                minHeap.offer(num);
            }else{
                maxHeap.offer(num);
            }
            System.out.println("===============");
            System.out.println(minHeap);
            System.out.println(maxHeap);

            if(!minHeap.isEmpty()&&!maxHeap.isEmpty()){
                if(minHeap.peek()>maxHeap.peek()){
                    int tmp = minHeap.poll();
                    minHeap.offer(maxHeap.poll());
                    maxHeap.offer(tmp);
                }
            }
            sb.append(minHeap.peek()).append('\n');


        }
        System.out.println(sb);


    }
}
