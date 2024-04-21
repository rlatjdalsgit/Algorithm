package Algorithm.SWAcademy;

import java.util.Scanner;

public class August_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0){
            System.out.println("3 1 2");
        } else if (a%3==1) {
            System.out.println("1 2 3");
        } else{
            System.out.println("2 3 1");
        }

    }
}
