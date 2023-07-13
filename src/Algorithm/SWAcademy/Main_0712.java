package Algorithm.SWAcademy;

import java.util.Scanner;

public class Main_0712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tryNum = sc.nextInt();//반복 횟수
        int[] finalArr = new int[tryNum];
        for(int i = 0; i<tryNum;i++){
            int size = sc.nextInt();//배열 크기 받기
            int[] arr = new int[size];//배열 생성
            for(int j=0;j<size;j++){//숫자 n개 받기
                arr[j]+=sc.nextInt();
            }
            //비교하기
            int spyIdx = 0;
            for(int j=1;j<size-1;j++){//비교하기
                int a = arr[j-1];
                int b = arr[j];
                int c = arr[j+1];
                if(a!=b){
                    if(a!=c){
                        spyIdx=j-1;
                    }else if(a==c){
                        spyIdx=j;
                    }
                }
                if(a==b){
                    if(a!=c){
                        spyIdx=j+1;
                    }
                }
            }
            finalArr[i]=spyIdx;
            //스파이 인덱스
        }
        for(int a : finalArr){
            System.out.println(a+1);
        }
    }
}
