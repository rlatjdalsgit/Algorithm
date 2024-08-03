package Algorithm.BOJ;

import java.util.Scanner;

public class Main_2745 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int B = scanner.nextInt();

        int toTen = Integer.parseInt(N, B);
        System.out.println(toTen);

        scanner.close();

    }

}
