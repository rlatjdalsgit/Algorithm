package Algorithm.BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_7569 {
    static int[][][] arr;
    static int[] dx = {0, 0, -1, 1, 0, 0};
    static int[] dy = {-1, +1, 0, 0, 0, 0};
    static int[] dh = {0, 0, 0, 0, 1, -1};
    static int M, N, H;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        arr = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int w = 0; w < M; w++) {
                    arr[i][j][w] = Integer.parseInt(st.nextToken());
                }
            }
        }

        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int w = 0; w < M; w++) {
                    if (arr[i][j][w] == 1) {
                        queue.add(new Pair(i, j, w, 0));
                    }
                }
            }
        }
        int day = 0;
        while (!queue.isEmpty()) {
            Pair pair = queue.remove();
            day = pair.day;
            for (int d = 0; d < 6; d++) {
                int tmpH = pair.h + dh[d];
                int tmpX = pair.x + dx[d];
                int tmpY = pair.y + dy[d];

                if (tmpH >= 0 && tmpH < H && tmpX >= 0 && tmpX < N && tmpY >= 0 && tmpY < M) {
                    if (arr[tmpH][tmpX][tmpY] == 0) {
                        queue.add(new Pair(tmpH, tmpX, tmpY, day + 1));
                        arr[tmpH][tmpX][tmpY] = 1;
                    }
                }
            }
        }
        if (checkTomato()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }

    }

    static boolean checkTomato() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int w = 0; w < M; w++) {
                    if(arr[i][j][w]==0){
                        return false;
                    }
                }
            }
        }
        return  true;
    }

    static class Pair {
        int h, x, y, day;

        Pair(int h, int x, int y, int day) {
            this.h = h;
            this.x = x;
            this.y = y;
            this.day = day;
        }

    }
}
