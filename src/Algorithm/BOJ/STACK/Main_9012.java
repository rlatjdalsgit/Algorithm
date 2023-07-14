package Algorithm.BOJ.STACK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class Main_9012 {
    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] arr = br.readLine().split("");
            String answer = solve(arr);
            System.out.println(answer);
        }

    }

    public static String solve(String[] arr) throws IOException {

        Stack<String> open = new Stack<>();
        for (String s : arr) {
            if (Objects.equals(s, "(")) {
                open.push("(");
            } else if (open.empty()) {
                return "NO";
            } else {
                open.pop();
            }
        }
        if (open.isEmpty()) {
            return "YES";
        } else {return "NO";}
    }

}
