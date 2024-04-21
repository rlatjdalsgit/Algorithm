package Algorithm.Programmers.Day3.LV1;

import java.util.Collections;

public class reverseArray {
    public int[] solution(long n) {
        String[] str = Long.toString(n).split("");
        int[] answer = new int[str.length];

        for(int i=0;i<str.length;i++){
            answer[i]=Integer.parseInt(str[str.length-1-i]);
        }
        return answer;
    }

}
