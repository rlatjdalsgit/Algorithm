package Algorithm.BOJ.DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_24416 {
    static int[] f;
    static int count1=0;
    static int count2=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        f= new int[n];

        fibo(n);
        dp(n);
        System.out.print(count1+" "+count2);


    }

    static int fibo(int n){
        if(n==1 ||n==2){
            count1++;

            return 1;
        }else{
            return (fibo(n-1)+fibo(n-2));
        }
    }
    static int dp(int n){
        f[0]=f[1]=1;
        for(int i=2;i<n;i++){
            count2++;

            f[i]=f[i-1]+f[i-2];
        }
        return f[n-1];
    }
}
