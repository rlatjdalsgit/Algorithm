package Algorithm.BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_7576 {
    static int[][] arr;
    static  int m;
    static  int n;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, +1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         m = Integer.parseInt(st.nextToken());
         n = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        int count=0; //그림 개수

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Pair> queue = new LinkedList<>(); //큐 만듦

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==1){
                    queue.add(new Pair(i,j,0));


                }

            }
        }
        int day=0;
        while(!queue.isEmpty()){
            Pair pair = queue.remove();
            day=pair.day;
            for(int d =0;d<4;d++){

                int tmpX = pair.X+dx[d];
                int tmpY = pair.Y+dy[d];
                if(tmpX>=0&&tmpX<n&&tmpY>=0&&tmpY<m){
                    if(arr[tmpX][tmpY]==0){
                        queue.add(new Pair(tmpX,tmpY,day+1));
                        arr[tmpX][tmpY]=1;
                        count++;
                    }

                }
            }

        }

        if(checkTomato()){
            System.out.println(day);

        }else {
            System.out.println(-1);
        }


    }

    static class Pair {  // 좌표 값을 저장할 자료구조 Pair
        int X;
        int Y;
        int day;

        Pair(int x, int y, int day) {
            this.X = x;
            this.Y = y;
            this.day = day;

        }
    }
    static boolean checkTomato() {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 0)
                    return false;
                // 덜 익은 토마토가 있다면
            }
        }
        return true;
    }


}
