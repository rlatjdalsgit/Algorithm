package Algorithm.BOJ.combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11050 {
    public static void main(String[] args) throws IOException {
        //(n k) = n!/(n-k)!k!

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


            System.out.println(factorial(n)/ (factorial(n-k)*factorial(k)));



    }

     static long factorial(int n ){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
     }
}
