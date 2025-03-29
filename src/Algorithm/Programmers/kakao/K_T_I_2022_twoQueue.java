package Algorithm.Programmers.kakao;
import java.util.*;

public class K_T_I_2022_twoQueue {
    public int solution(int[] queue1, int[] queue2) {

        int n = queue1.length;
        long sum1 =0, sum2=0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int i=0;i<n;i++){
            q1.offer(queue1[i]);
            sum1+=queue1[i];
            q2.offer(queue2[i]);
            sum2+=queue2[i];
        }

        int count =0;
        int maxCount = n*3;

        while(count<=maxCount){
            if(sum1==sum2){
                return count;
            }

            if(sum1>sum2){
                int val = q1.poll();
                q2.offer(val);
                sum1-=val;
                sum2+=val;
            }else{
                int val= q2.poll();
                q1.offer(val);
                sum2-=val;
                sum1+=val;
            }
            count++;
        }



        return -1;
    }

}
