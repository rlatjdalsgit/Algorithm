package Algorithm.BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1926 {
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
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i + 1][j + 1] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Pair> queue = new LinkedList<>(); //큐 만듦

        int count=0; //그림 개수
        int maxSize=0;///그림 최대크기

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(arr[i][j]==1&& !visited[i][j]){
                    int size=0;
                    queue.add(new Pair(i,j));
                    visited[i][j]=true;

                    while(!queue.isEmpty()){
                         Pair pair = queue.remove();
                         size++;

                         for(int d =0;d<4;d++){
                             int tmpX = pair.X+dx[d];
                             int tmpY = pair.Y+dy[d];

                             if(arr[tmpX][tmpY]==1&& !visited[tmpX][tmpY]){
                                 queue.add(new Pair(tmpX,tmpY));
                                 visited[tmpX][tmpY]=true;
                             }
                         }
                    }
                    count++;
                    if(size>maxSize) maxSize=size;
                }
            }
        }
        System.out.println(count + "\n" + maxSize);


    }

    static class Pair {  // 좌표 값을 저장할 자료구조 Pair
        int X;
        int Y;

        Pair(int x, int y) {
            this.X = x;
            this.Y = y;
        }
    }


}
