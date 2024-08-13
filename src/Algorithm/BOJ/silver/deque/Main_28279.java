package Algorithm.BOJ.silver.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main_28279 {
    static Deque<Integer> deque = new ArrayDeque<>();

    static StringBuilder sb= new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            if (st.hasMoreTokens()) {
                int b = Integer.parseInt(st.nextToken());
                func(a,b);
            } else {
                func(a);
            }
        }
        System.out.println(sb);
    }

    static void func(int a) {
        if (a == 3) {
            if(deque.isEmpty()){
                sb.append(-1).append('\n');
            }else{
                sb.append(deque.pollFirst()).append('\n');
            }
        } else if (a == 4) {
            if(deque.isEmpty()){
                sb.append(-1).append('\n');
            }else{
                sb.append(deque.pollLast()).append('\n');
            }
        } else if (a == 5) {
            sb.append(deque.size()).append('\n');
        } else if (a == 6) {
            if(deque.isEmpty()){
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        } else if (a == 7) {
            if(deque.isEmpty()){
                sb.append(-1).append('\n');
            }else{
                sb.append(deque.getFirst()).append('\n');
            }
        } else if (a == 8) {
            if(deque.isEmpty()){
                sb.append(-1).append('\n');
            }else{
                sb.append(deque.getLast()).append('\n');
            }

        }
    }

    static void func(int a, int b) {
        if(a==1){
            deque.addFirst(b);
        }else{
            deque.addLast(b);
        }
    }

}
