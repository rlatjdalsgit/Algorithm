package Algorithm.SWAcademy;

import java.util.Scanner;

public class Main_0717 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String state="NO";
        for(int i = 0 ; i<str1.length()-str2.length()+1;i++){
            String a =str1.substring(i, i + str2.length());
            if(a.equals(str2)){
                state="YES";
                break;
            }

        }
        System.out.println(state);
    }
}
