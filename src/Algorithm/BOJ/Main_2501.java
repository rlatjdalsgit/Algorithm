package Algorithm.BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=a;i++){
            if(a%i==0){
                list.add(i);
            }
        }

        if(list.size()<b){
            System.out.println(0);
        }else{
            System.out.println(list.get(b-1));

        }
    }
}
