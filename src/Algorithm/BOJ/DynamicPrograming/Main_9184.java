package Algorithm.BOJ.DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9184 {
    static StringBuilder sb = new StringBuilder();
    static int[][][] arr=new int[21][21][21];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==-1&&b==-1&&c==-1){
                break;
            }else{
                int result = dp(a,b,c);
                sb.append("w("+a+", "+b+", "+c+") = ").append(result).append('\n');
            }
        }

        System.out.println(sb);
    }
    static int dp(int a, int b, int c){
        if(inRange(a, b, c) && arr[a][b][c] != 0) {
            return arr[a][b][c];
        }

        if(a<=0||b<=0||c<=0){
            return 1;
        }
        if(a>20||b>20||c>20){
            return arr[20][20][20]=dp(20,20,20);
        }
        if(a<b&&b<c){
            return arr[a][b][c]= dp(a,b,c-1)+dp(a, b-1,c-1) - dp(a, b-1,c);
        }
        return  arr[a][b][c]= dp(a-1, b, c) + dp(a-1, b-1, c) + dp(a-1, b, c-1) - dp(a-1, b-1, c-1);
    }
    static boolean inRange(int a, int b, int c) {
        return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
    }
}
