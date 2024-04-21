package Algorithm.SWAcademy.sepsep;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][4];//데이터들
        for (int i = 0; i < size; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            arr[i][3] = arr[i][0] * 4 + arr[i][1] * 4 + arr[i][2] * 9;
        }
        int[] target = new int[4];

            target[0] = sc.nextInt();
            target[1] = sc.nextInt();
            target[2] = sc.nextInt();
            target[3] = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i][0] <= target[0] && arr[i][1] >= target[1]
                    && arr[i][2] <= target[2] && arr[i][3] <= target[3]) {
                counter+=1;
            }
        }

        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if ((arr[i][0])+(arr[j][0]) <= target[0] && arr[i][1] +arr[j][1]>= target[1]
                        && arr[i][2]+arr[j][2] <= target[2] && arr[i][3] +arr[j][3]<= target[3]) {
                        counter+=1;
                }
            }
        }
        for (int i = 0; i < size-2; i++) {
            for (int j = i+1; j < size-1; j++) {
                for (int z = j+1; z < size; z++) {
                    if ((arr[i][0] ) + (arr[j][0] ) + arr[z][0]  <= target[0] && arr[i][1]  + arr[j][1]  + arr[z][1] >= target[1]
                            && arr[z][2] + arr[i][2]  + arr[j][2]  <= target[2] && arr[z][3] + arr[i][3] + arr[j][3] <= target[3]) {
                        counter+=1;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}