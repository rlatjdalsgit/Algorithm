package Algorithm.BOJ.advanced_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum=0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i]=num;
            sum+=num;
            if(hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num)+1);
            }else{
                hashMap.put(num, 1);
            }
        }
        //1조건
        sb.append(Math.round((float) sum /N)).append('\n');

        //2조건
        Arrays.sort(arr);
        sb.append(arr[(N/2)]).append('\n');

        //3조건
        int max = Collections.max(hashMap.values());
        List<Integer> list = new ArrayList<>();

        for(int key : hashMap.keySet()){
            if(hashMap.get(key)==max){
                list.add(key);
            }
        }
        Collections.sort(list);
        sb.append(list.size()>1 ? list.get(1) : list.get(0)).append('\n');

        //4조건
        sb.append(arr[N-1]-arr[0]);

        System.out.println(sb);




    }

}
