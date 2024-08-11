package Algorithm.BOJ.silver.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_28278 {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());

            if(st.countTokens()==1){
                int a = Integer.parseInt(st.nextToken());
                checker(a);
            }else{
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                checker(a, b);
            }
        }
    }
    static void checker(int a){
        if(a==2){
            if(stack.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(stack.pop());
            }
        } else if (a==3) {
            System.out.println(stack.size());
        } else if (a==4) {
            if(stack.isEmpty()){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }else{
            if(stack.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(stack.peek());
            }

        }
    }
    static void checker(int a, int b){
        stack.add(b);
    }
}
