package Algorithm.BOJ.silver.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_18258 {
    static Queue<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(st.hasMoreTokens()){
                int a = Integer.parseInt(st.nextToken());
                queue.add(a);
            }else{
                func(str);
            }
        }

        System.out.println(sb);

    }
    static void func(String str){
        if(str.equals("pop")){
            if(queue.isEmpty()){
                sb.append(-1).append('\n');
            }else{
                sb.append(queue.poll()).append('\n');
            }
        } else if (str.equals("size")) {
            sb.append(queue.size()).append('\n');
        }else if (str.equals("empty")) {
            if(queue.isEmpty()){
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }else if (str.equals("front")) {
            if(queue.isEmpty()){
                sb.append(-1).append('\n');
            }else{
                sb.append(queue.peek()).append('\n');
            }
        }else if (str.equals("back")) {
            if(queue.isEmpty()){
                sb.append(-1).append('\n');
            }else{
                sb.append(((LinkedList<Integer>) queue).getLast()).append('\n');
            }
        }
    }
}
