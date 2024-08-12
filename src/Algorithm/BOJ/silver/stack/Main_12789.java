package Algorithm.BOJ.silver.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        Stack<Integer> stack = new Stack<>();
        int idx = 1;

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(arr[i]) == idx) {//줄에서 나가는 사람이 해당번호와 일치할때
                idx++;
            } else {
                // 만약 숫자가 다를땐.
                // 대기줄에 해당하는 숫자가 있는지! 있으면 그 사람은 나가는거고, 다음번호가 불려야 하고, 대기줄에선 나가야하고,
                // 1) 기존 스택에 다음 인덱스에 해당하는 숫자가 있는지 확인 후 있으면 pop, idx++
                if (!stack.isEmpty() && stack.peek() == idx) {
                    stack.pop();
                    i--;
                    idx++;
                } else {// 2) 아니면 stack에 push
                    stack.push(Integer.parseInt(arr[i]));
                }
            }
        }
        String result = "Nice";
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            if (pop == idx) {
                idx++;
            } else {
                result = "Sad";
                break;
            }
        }
        System.out.println(result);

    }
}
