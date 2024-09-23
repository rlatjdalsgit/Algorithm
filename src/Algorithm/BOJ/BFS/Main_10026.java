package Algorithm.BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_10026 {
    static Character[][] arr;
    static boolean[][] visit;
    static int count = 0;
    static Queue<Pair> queue = new LinkedList<>(); //큐 만듦
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, +1, 0, 0};
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        arr = new Character[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) {
                    bfs(i, j);
                    count++;
                }
            }
        }

        sb.append(count).append(" ");
        count = 0;
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) {
                    bfs(i, j);
                    count++;
                }
            }
        }
        sb.append(count);
        System.out.println(sb);


    }

    static void bfs(int x, int y) {
        queue.add(new Pair(x, y));
        visit[x][y] = true;
        while (!queue.isEmpty()) {
            Pair pair = queue.remove();

            for (int i = 0; i < 4; i++) {
                int tmpX = pair.x + dx[i];
                int tmpY = pair.y + dy[i];

                if (tmpX < 0 || tmpX >= N || tmpY < 0 || tmpY >= N) {
                    continue;
                }
                if (visit[tmpX][tmpY]) {
                    continue;
                }
                if (arr[pair.x][pair.y] != arr[tmpX][tmpY]) {
                    continue;
                }

                visit[tmpX][tmpY] = true;
                queue.add(new Pair(tmpX, tmpY));
            }
            if (arr[pair.x][pair.y] == 'G') {
                arr[pair.x][pair.y] = 'R';
            }
        }

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
