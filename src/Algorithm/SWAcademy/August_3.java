package Algorithm.SWAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class August_3{
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        boolean result=true;
        for(int i =0;i<arr.length;i++){
            if(Objects.equals(arr[i], "(")){
                stack.push('(');
            } else if (Objects.equals(arr[i], "{")) {
                stack.push('{');
            }else if (Objects.equals(arr[i], "[")) {
                stack.push('[');
            }else if (Objects.equals(arr[i], "]")) {
                if(stack.isEmpty()){
                    System.out.println("NO");
                    result=false;
                    break;
                }
                char b=stack.peek();
                if(b=='['){
                    stack.pop();
                }else{
                    System.out.println("NO");
                    result=false;
                    break;
                }
            }else if (Objects.equals(arr[i], ")")) {
                if(stack.isEmpty()){
                    System.out.println("NO");
                    result=false;
                    break;
                }
                char b=stack.peek();
                if(b=='('){
                    stack.pop();
                }else{
                    System.out.println("NO");
                    result=false;
                    break;
                }
            }else if (Objects.equals(arr[i], "}")) {
                if(stack.isEmpty()){
                    System.out.println("NO");
                    result=false;
                    break;
                }
                char b=stack.peek();
                if(b=='{'){
                    stack.pop();
                }else{
                    System.out.println("NO");
                    result=false;
                    break;
                }
            }
        }
        if(result!=false)
            if(stack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


    }
}
