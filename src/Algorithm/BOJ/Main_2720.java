package Algorithm.BOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_2720 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int repeat = scanner.nextInt();

        for(int i=0;i<repeat;i++){
            calc(scanner.nextInt());
        }

    }
    static void calc(int data){
        List<Integer> list = new ArrayList<>();
        list.add(data/25);
        data=data%25;
        list.add(data/10);
        data=data%10;
        list.add(data/5);
        data=data%5;
        list.add(data/1);


        for(int i=0;i<4;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


    }


}
