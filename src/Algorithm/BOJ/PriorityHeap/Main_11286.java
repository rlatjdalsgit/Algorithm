package Algorithm.BOJ.PriorityHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //음수 반환: o1이 앞에 위치 (우선순위가 높음)
        //양수 반환: o2가 앞에 위치 (우선순위가 높음)
        //0 반환: o1과 o2의 순서가 동일
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {//기존, 새로
                if(Math.abs(o1)>Math.abs(o2)) {
                    //원래 있던애가 더 크다. == 뒤로 가야 한다.
                    return Math.abs(o1) - Math.abs(o2);
                } else if (Math.abs(o1)<Math.abs(o2)) {
                    //새로 온에가 더 크다. == 그대로
                    return -1; //음수반환 = 원래꺼가 앞에
                }else{//Math.abs(o1)==Math.abs(o2)
                    // -1 1
                    // 1 -1
                    return o1-o2;
                }
            }
        });
        int N = Integer.parseInt(br.readLine());
        for(int i =0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                if(queue.size()==0){
                    sb.append(0).append('\n');
                }else{
                    sb.append(queue.poll()).append('\n');
                }
            }else{
                queue.offer(num);
            }
        }
        System.out.println(sb);
    }
}
