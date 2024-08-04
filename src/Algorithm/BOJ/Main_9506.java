package Algorithm.BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            if (a == -1) break;

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= a - 1; i++) {
                if (a % i == 0) {
                    list.add(i);
                }
            }

            int result = 0;
            for (int num : list) {
                result += num;
            }
            if (result == a) {
                System.out.print(a + " = 1");
                for (int num : list) {
                    if (num != 1) {
                        System.out.print(" + " + num);
                    }
                }
                System.out.println();

            } else {
                System.out.println(a + " is NOT perfect.");
            }


        }
    }
}
