package Algorithm.BOJ.silver.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<N;i++){
            int a = Integer.parseInt(br.readLine());

            if(a==0){
                stack.pop();
            }else {
                stack.add(a);
            }
        }
        int ans =0;
        while(stack.size()!=0){
            ans+=stack.pop();
        }

        System.out.println(ans);
    }
}
