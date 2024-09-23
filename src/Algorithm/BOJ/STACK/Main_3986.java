package Algorithm.BOJ.STACK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<n;i++){
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();

            if(str.length()%2==0){
                for(int j=0;j<str.length();j++){
                    if(j==0){
                        stack.push(str.charAt(j));
                    } else if (!stack.isEmpty() && (stack.peek() == str.charAt(j))) {
                        stack.pop();
                    }else {
                        stack.push(str.charAt(j));
                    }
                }
                if(stack.isEmpty()){
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
