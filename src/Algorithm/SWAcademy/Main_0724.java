package Algorithm.SWAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        int wall=0;
        String state = "NO";
        for(int i =1;i< 6;i++){
            if(arr[i].equals("#")){
                if (wall==0){
                    wall++;
                }

            }
            if(i== arr.length-2){

            }
        }
        System.out.println(state);

    }
}
