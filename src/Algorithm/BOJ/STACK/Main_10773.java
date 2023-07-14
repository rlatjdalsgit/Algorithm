package Algorithm.BOJ.STACK;

import java.util.Scanner;
import java.util.Stack;

public class Main_10773 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0;i<count;i++){
            int get = sc.nextInt();
            if(get==0){
                stack.pop();
            }else {
                stack.push(get);
            }
        }
        int answer=0;
        while(!stack.isEmpty()){
               answer+=stack.pop();
        }
        System.out.println(answer);
    }
}
