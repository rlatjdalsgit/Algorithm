package Algorithm.BOJ.silver.deque;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main_2346 {
    static Deque<balloon> deque = new ArrayDeque<>();

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int n = Integer.parseInt(st.nextToken());
            deque.addLast(new balloon(i, n));
        }
        //1번
        sb.append(1).append(' ');
        int a = deque.pollFirst().val;

        while(!deque.isEmpty()){
            if (a > 0) {
                for (int i = 0; i < a - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
                a = deque.getFirst().val;

                int idx = deque.pollFirst().idx;
                sb.append(idx).append(' ');
            } else {
                for (int i = 0; i < Math.abs(a)-1; i++) {
                    deque.addFirst(deque.pollLast());
                }
                a = deque.getLast().val;

                int idx = deque.pollLast().idx;
                sb.append(idx).append(' ');
            }
        }
        //반복조건 시작
        System.out.println(sb);
    }

}

class balloon {
    int idx, val;

    public balloon(int idx, int val) {
        this.idx = idx;
        this.val = val;
    }
}
