package Algorithm.BOJ.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_25501 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            isPalindrome(br.readLine());
        }
        System.out.println(sb);

    }
    static int counter=0;
    static void isPalindrome(String str){
        counter=0;
        int first = recursion(str, 0, str.length()-1);
        int second = counter;
        sb.append(first).append(' ').append(second).append('\n');
    }

    static int recursion(String str, int start, int end){
        counter++;
        if(start>=end){
            return 1;
        } else if (str.charAt(start)!=str.charAt(end)) {
            return 0;
        } else{
            return recursion(str, start+1, end-1);
        }
    }

}
