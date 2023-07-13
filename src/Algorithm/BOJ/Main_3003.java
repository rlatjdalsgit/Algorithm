package Algorithm.BOJ;

import java.util.Scanner;

public class Main_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[6];
        for(int i =0; i<6; i++){
            arr[i]=sc.nextInt();//갯수 받아오기
        }
        int answer[] = new int[6];
        //킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로
        answer[0]=1-arr[0];
        answer[1]=1-arr[1];
        answer[2]=2-arr[2];
        answer[3]=2-arr[3];
        answer[4]=2-arr[4];
        answer[5]=8-arr[5];
        for(int a : answer){
            System.out.print(a+" ");
        }
    }
}
