package Algorithm.BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int state = 1;
        int q =0;
        int w =str.length()-1;
        while(q<w){
             if(str.charAt(q)!=str.charAt(w))  state=0;
             q++;
             w--;
        }
        System.out.println(state);
    }
}

