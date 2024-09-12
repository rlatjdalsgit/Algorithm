package Algorithm.BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2178 {
    static int[][] arr;
    static boolean[][] visited;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, +1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n + 2][m + 2];
        visited = new boolean[n + 2][m + 2];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i + 1][j + 1] = s.charAt(j)-'0';
            }
        }


        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(1, 1));
        visited[1][1] = true;

        while (!queue.isEmpty()) {
            Pair pair = queue.remove();

            for (int d = 0; d < 4; d++) {
                int tmpX = pair.x + dx[d];
                int tmpY = pair.y + dy[d];

                if(tmpX<0||tmpX>=n+1||tmpY<0||tmpY>=m+1){
                    continue;
                }
                if(arr[tmpX][tmpY]==0){
                    continue;
                }
                if(visited[tmpX][tmpY]){
                    continue;
                }

                queue.offer(new Pair(tmpX, tmpY));
                visited[tmpX][tmpY]=true;
                arr[tmpX][tmpY]=arr[pair.x][pair.y]+1;

            }

        }

        System.out.println(arr[n][m]);


    }

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
