package Algorithm.Programmers.Day3.LV1;

import java.util.Arrays;

public class arrayGoDown {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.parseInt(arr[i]); // 문자열을 int로 변환하여 배열에 저장
        }

        for(int i=0;i<result.length;i++){
            for(int j=i+1;j<result.length;j++){
                if(result[i]<result[j]){
                    int tmp = result[i];
                    result[i] = result[j];
                    result[j] = tmp;

                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int num : result) {
            builder.append(num);
        }
        return Long.parseLong(builder.toString());


    }

}
