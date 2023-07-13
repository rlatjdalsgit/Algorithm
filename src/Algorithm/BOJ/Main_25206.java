package Algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main_25206 {
    public static void main(String[] args) throws IOException {
        int count = 20;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double getSum = 0.0, div = 0.0;
        for (int i=0;i<count;i++){
            String arr[] = br.readLine().split(" ");
            double h = Float.parseFloat(arr[1]);

            String str = arr[2];
            if(!Objects.equals(str, "P")){
                div+=h;
                double result = calculate(h, str);
                getSum = getSum + result;
            }
            }
        System.out.println(getSum/div);
    }
    static double calculate(double a, String b){
        double switched = 0.0;
        switch (b){
            case "A+" :
                switched=4.5;
                break;
            case "A0" :
                switched=4.0;
                break;
            case "B+":switched=3.5;
                break;
            case "B0" :switched=3.0;
                break;
            case "C+" :switched=2.5;
                break;
            case "C0" :switched=2.0;
                break;
            case "D+" :switched=1.5;break;
            case "D0" :switched=1.0;break;
            case "F" :switched=0.0;
                break;
        }
        return a*switched;
    }
}
