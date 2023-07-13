package Algorithm.BOJ;

import java.util.Scanner;

public class Main_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr= new int[N][M];
        for(int count=0;count<2;count++){
            for(int i=0;i<N;i++){
                for(int j = 0;j<M ; j++){
                    arr[i][j]+=sc.nextInt();
                }
            }
        }
        for(int i=0;i<N;i++){

            for (int j=0;j<M;j++){
                System.out.print(arr[i][j]+" ");
            }
            if(i!=(N-1)){
                System.out.println();
            }

        }

    }
}
