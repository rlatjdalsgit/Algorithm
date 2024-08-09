package Algorithm.BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 제곱수의 개수는 N 이하의 제곱수의 개수와 동일
        int result = (int) Math.sqrt(N);

        System.out.println(result);
    }
}