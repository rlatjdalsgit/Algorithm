package Algorithm.BOJ;

import java.util.Scanner;

public class Main_2566 {
    public static void main(String[] args) {
        int[][] NM = new int[9][9];
        int max =0;
        int N=1;
        int M=1;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<9;i++){
            for(int j =0 ; j<9;j++){
                int now=sc.nextInt();
                if(now>max){
                    max=now;
                    N=i+1;
                    M=j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(N+" "+M);
    }
}
