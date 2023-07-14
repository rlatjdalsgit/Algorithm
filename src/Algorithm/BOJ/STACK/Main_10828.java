package Algorithm.BOJ.STACK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10828 {
    static void push(Stack<Integer> stack, int x){
        stack.push(x);
    }
    static void pop(Stack<Integer> stack){
        if(!stack.isEmpty()){
            System.out.println(stack.pop());
        }else {
            System.out.println(-1);
        }
    }
    static void size(Stack<Integer> stack){
        System.out.println(stack.size());
    }
    static void empty(Stack<Integer> stack){
        if(stack.isEmpty()){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    static void top(Stack<Integer> stack){
        if(stack.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(stack.peek());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++){
            String[] arr = br.readLine().split(" ");
            if (arr[0].equals("push")) {
                push(stack, Integer.parseInt(arr[1]));
            } else if (arr[0].equals("pop")) {
                pop(stack);
            } else if (arr[0].equals("size")) {
                size(stack);
            }else if (arr[0].equals("empty")) {
                empty(stack);
            }else if (arr[0].equals("top")) {
                top(stack);
            }
        }
    }

}
