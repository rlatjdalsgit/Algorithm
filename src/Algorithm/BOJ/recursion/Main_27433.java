package Algorithm.BOJ.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fact(N));

    }
    static long fact(int n){

        if(n<=0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

}
