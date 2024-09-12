package Algorithm.BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1012 {
    static int M;
    static int N;
    static int[][] arr;
    static boolean[][] visited;
    static int count;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, +1, 0, 0};

    static int now_x, now_y;
    static Queue<Node> queue = new LinkedList<>();

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            arr = new int[N][M];
            visited = new boolean[N][M];
            int K = Integer.parseInt(st.nextToken());
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[b][a] = 1;
            }
            count = 0;
            for (int a = 0; a < N; a++) {
                for (int b = 0; b < M; b++) {
                    if (!visited[a][b] && arr[a][b] == 1) {
                        count++;
                        bfs(b, a);
                    }
                }
            }
            sb.append(count).append('\n');
            //저장완료
        }
        System.out.println(sb);
    }

    static void bfs(int x, int y){
        queue.add(new Node(x,y));
        visited[y][x]=true;

        while(!queue.isEmpty()){
            Node node= queue.poll() ;

            for(int i =0;i<4;i++){
                now_x = node.x+dx[i];
                now_y = node.y+dy[i];

                if(Range_check() && visited[now_y][now_x] == false && arr[now_y][now_x] == 1) {
                    queue.offer(new Node(now_x, now_y));
                    visited[now_y][now_x] = true;
                }


            }
        }

    }
    public static boolean Range_check() {
        return (now_x >= 0 && now_x < M && now_y >= 0 && now_y < N);
    }



}
