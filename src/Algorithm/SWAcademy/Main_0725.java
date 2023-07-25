package Algorithm.SWAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;


public class Main_0725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for(int i = 0 ;i<count;i++){
            String[] length_wall = br.readLine().split(" ");
            String[] arr;
            int crush=Integer.parseInt(length_wall[1]);
            arr=br.readLine().split("");
            if(i!=count-1){
                br.readLine();
            }

            boolean result=checker(arr, crush);
            if(result){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static int find_dooridx(String[] arr){
        for(int i =0;i<arr.length;i++){
            if(Objects.equals(arr[i], "O")){
                return i;
            }
        }
        return 0;
    }
    public static int find_myselfIdx(String[] arr){
        for(int i =0;i<arr.length;i++){
            if(Objects.equals(arr[i], "@")){
                return i;
            }
        }
        return 0;
    }
    public static Boolean checker(String[] arr, int crush) {
        int a = arr.length;
        int door_idx = find_dooridx(arr);
        int myself = find_myselfIdx(arr);
        int count=0;
        if(door_idx<myself){
            for(int i =door_idx+1;i<myself;i++){
                if(Objects.equals(arr[i], "#"))
                    count++;
            }
        }else {
            for(int i = myself+1;i<door_idx;i++){
                if(Objects.equals(arr[i], "#"))
                    count++;
            }
        }
        if(count>crush){
            return false;
        }else
            return true;
    }

}
