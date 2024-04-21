package Algorithm.SWAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class August_4{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int length=Integer.parseInt(arr[1]);
        int[][] getter = new int[length][2];
        for(int i = 0 ;i<length;i++){
            String[] get = br.readLine().split(" ");
            getter[i][0]=Integer.parseInt(get[0]);
            getter[i][1]=Integer.parseInt(get[1]);
        }//저장 완료
        boolean state=true;
        for(int i = 0 ;i<length;i++){
            if(getter[i][1] == getter[i][0]){
                state=false;
                break;
            }
            int a = getter[i][0];
            int b = getter[i][1];
            for(int j =i;j<length;j++){
                if((a==getter[j][1])&&(b==getter[j][0])){
                    state=false;
                    break;
                }
            }
        }
        if(state){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }

}
