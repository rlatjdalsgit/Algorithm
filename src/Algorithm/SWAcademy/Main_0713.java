package Algorithm.SWAcademy;

import java.util.Scanner;

public class Main_0713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0;i<count;i++){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int j=0;j<size;j++){
                arr[j]=sc.nextInt();
            }
            for(int j =0;j<size-1;j++){
                    if(arr[j]>arr[j+1]){
                        arr[j]=(arr[j]/2);
                        j=-1;

                    }

            }

            for(int q : arr){
                System.out.print(q+" ");
            }
            System.out.println();


        }
    }
}
