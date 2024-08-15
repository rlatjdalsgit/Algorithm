package Algorithm.BOJ.advanced_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> hashSet = new HashSet<>();
        int count =0;
        int N = Integer.parseInt(br.readLine());
        br.readLine();
        for(int i=0;i<N-1;i++){
            String str = br.readLine();
            if(str.equals("ENTER")){
                count+=hashSet.size();
                hashSet.clear();
            }else{
                hashSet.add(str);
            }
        }
        count+=hashSet.size();
        System.out.println(count);
    }
}
