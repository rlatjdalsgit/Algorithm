package Algorithm.BOJ.silver.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) {
                deque.addLast(num);
            }
        }

        int repeat = Integer.parseInt(br.readLine());
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i < repeat; i++) {
            deque.addFirst(Integer.parseInt(st.nextToken()));
            sb.append(deque.pollLast()).append(' ');
        }

        System.out.println(sb);

    }
}
