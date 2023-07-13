package Algorithm.BOJ;

import java.util.Scanner;

public class Main_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 0;i<a-1;i++){
            System.out.print(" ".repeat(a-i-1));
            System.out.println("*".repeat(2*i+1));
        }
        for(int i = a-1;i>=0;i--){
            System.out.print(" ".repeat(a-i-1));
            System.out.println("*".repeat(2*i+1));

        }

    }
}
