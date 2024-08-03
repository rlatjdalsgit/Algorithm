package Algorithm.BOJ;

import java.util.Scanner;

public class Main_11005 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int B = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        while(N>0){
            int added = N%B;
            if(added<10){
                result.append((char)(added+'0'));
            }else{
                result.append((char)(added-10+'A'));
            }
            N/=B;
        }
        System.out.println(result.reverse().toString());

    }

}
