package Algorithm.BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1697 {
    static int visited[] = new int[100001];
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        System.out.println(bfs(N));


    }

    static int bfs(int node){
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(node);

        int index= node;// 내 처음 위치가 기준점
        int n;
        visited[index]=1;
        //n+1, n-1, 2*n
        while(!queue.isEmpty()){
            n=queue.remove();
            if(n==K){
                return visited[n]-1;
            }
            if(n-1>=0&&visited[n-1]==0){//n-1
                visited[n-1]=visited[n]+1;
                queue.add(n-1);
            }
            if(n+1<=100000&&visited[n+1]==0){//n+1
                visited[n+1]=visited[n]+1;
                queue.add(n+1);
            }
            if (2*n<=100000&&visited[2*n]==0) {
                visited[2*n]=visited[n]+1;
                queue.add(2*n);
            }

        }
        return -1;


    }
}
