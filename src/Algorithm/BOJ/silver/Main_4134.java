package Algorithm.BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N  = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            long a = Long.parseLong(br.readLine());

            for(long j=a; ; j++){
                if(isPrime(j)){
                    System.out.println(j);
                    break;
                }
            }
        }
    }

    static boolean isPrime(long n){
        if(n<=1) return false;

        if(n<=3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for(long i=5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
