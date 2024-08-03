package Algorithm.BOJ;

import java.util.Scanner;

public class Main_2903 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int result=3;
        if(a==1){
            System.out.println(9);
        }else {
            for(int i=1;i<a;i++){
                result+=Math.pow(2,i);
            }
            System.out.println(result*result);
        }

    }
}
