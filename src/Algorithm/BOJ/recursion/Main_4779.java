package Algorithm.BOJ.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4779 {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while((str = br.readLine())!=null) {
            sb= new StringBuilder();
            int num = Integer.parseInt(str);
            int len = (int) Math.pow(3,num);
            for(int i=0;i<len;i++){
                sb.append('-');
            }
            recursion(0,len );
            System.out.println(sb);

        }
    }
    static void recursion(int start, int size){
        if(size==1){
            return;
        }
        int idx = size/3;
        for(int i=start+idx;i<start+idx*2;i++){
            sb.setCharAt(i,' ');
        }
        recursion(start, idx);
        recursion(start+idx*2,idx);
    }

}
