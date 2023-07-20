package Algorithm.SWAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split("");
        String[] b = br.readLine().split("");
        boolean[] checker = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            for( int j = 0;j<b.length;j++){
                if(a[i].equals(b[j])){
                    checker[i]=true;
                    b[j]=null;
                    break;
                }
            }
        }

        for (int i = 0; i < checker.length; i++) {
            if(!checker[i]){
                System.out.println("NO");
                break;
            }
            if(i==checker.length-1){
                System.out.println("YES");

            }
        }


    }
}
