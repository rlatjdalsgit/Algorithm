package Algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] str = new String[5][15];
        for(int i =0;i<5;i++){
            String[] getter=br.readLine().split("");
            for(int j =0;j<getter.length;j++) {
                str[i][j]=getter[j];
            }
        }
        StringBuilder answer= new StringBuilder();
        for(int i = 0;i<15;i++){
            for(int j =0;j<5;j++){
                if(str[j][i]!=null){
                    answer.append(str[j][i]);
                }
            }
        }
        System.out.println(answer);
    }
}
