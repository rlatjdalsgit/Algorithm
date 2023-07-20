package Algorithm.BOJ.STACK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class Main_4949 {
    static void Checker(String str){
        String state = "YES";

        Stack<String> stack = new Stack<>();

        String[] arr = str.split("");
        for (String s : arr) {
            if (Objects.equals(s, "(")) {
                stack.push("(");
            } else if (Objects.equals(s, "[")) {
                stack.push("[");
            } else if (Objects.equals(s, ")")) {
                if(stack.isEmpty()){
                    state=("NO");
                    break;
                }
                if(stack.peek().equals("(")){
                    stack.pop();
                }else{
                    state=("NO");
                    break;

                }
            }else if (Objects.equals(s, "]")) {
                if(stack.isEmpty()){
                    state=("NO");
                    break;
                }
                if(stack.peek().equals("[")){
                    stack.pop();
                }else{
                    state=("NO");
                    break;

                }

            }
        }
        if(stack.isEmpty()&& !state.equals("NO")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) throws IOException {
        Stack<String> small = new Stack<>();
        Stack<String> big = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String state = "YES";

        while(!Objects.equals(str = br.readLine(), ".")){
            Checker(str);
        }
    }
}
