package Algorithm.BOJ.DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1904 {
    static int[] arr=new int[1000001];
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         N = Integer.parseInt(br.readLine());
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;

        for(int i=3;i<arr.length;i++){
            arr[i]=-1;
        }

        System.out.println(fibo(N));


    }
    static int fibo(int n ){
        if(arr[n]==-1){
            arr[n]=(fibo(n-1)+fibo(n-2))%15746;
        }
        return arr[n];
    }
}
