package Algorithm.SWAcademy;

import java.util.Scanner;

public class August_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for(int i =0;i<a;i++){
           arr[i]=sc.nextInt();
        }
        int tmp=-10000;
        for(int i =0;i<a-b+1;i++){
            int now=0;
            for(int j = i;j<i+b;j++){
                now+=arr[j];
            }
            if(now>tmp){
                tmp=now;
            }

        }
        System.out.println(tmp);

    }
}
