package Algorithm.SWAcademy;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_0714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count= sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int t = 0;t<count;t++){
            int size = sc.nextInt();
            for(int i = 0;i<size;i++){
                arr.add(sc.nextInt());
            }
            for(int z = 1;z<arr.size();z++){
                if(arr.get(z - 1) >arr.get(z)){
                    arr.remove(z);
                    z--;
                }
            }
        }
        for(int i : arr){
                if(i!=-1){
                    System.out.print(i+" ");
                }
        }



//        for(int z = 0;z<count;z++){
//            int size = sc.nextInt();
//            int[] arr = new int[size];
//            for(int i=0;i<size;i++){
//                arr[i]=sc.nextInt();
//            }
//            for(int i=1;i<size;i++){
//                if(arr[i-1]>arr[i]){
//                    arr[i]=arr[i-1];
//                    arr[i-1]=-1;
//                    i--;
//                }
//            }
//            for(int i : arr){
//                if(i!=-1){
//                    System.out.print(i+" ");
//                }
//            }
//            System.out.println();
//        }
    }
}
