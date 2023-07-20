package Algorithm.SWAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0719 {
    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i = 0 ; i<str.length();i++){
            int a = (int)str.charAt(i);
            arr[a-97]=true;
        }
        String state = "YES";
        for (boolean b : arr) {
            if (!b) {
                state = "NO";
                break;
            }
        }
        System.out.println(state);
    }
}
