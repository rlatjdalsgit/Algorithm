package Algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[5];

        for(int i = 0;i<5;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int avg=0;
        for (int val : arr) {
            avg+=val;
        }
        System.out.println(avg/5);

        System.out.println(arr[2]);

    }
}
