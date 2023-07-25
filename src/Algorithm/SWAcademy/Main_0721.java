package Algorithm.SWAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split("");
        String[] b = br.readLine().split("");
        String status = "NO";
        int idx=0;
        for(int i =0 ;i<a.length;i++){
            if(a[i].equals(b[idx])){
                idx++;
                if(idx==b.length){
                    status="YES";
                    break;
                }
            }
        }
        System.out.println(status);
    }
}

