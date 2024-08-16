package Algorithm.BOJ.advanced_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if(str.length()>=M){
                hashMap.put(str, hashMap.getOrDefault(str,0)+1);
            }
        }

        List<String> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //빈도수
                if(Integer.compare(hashMap.get(o1), hashMap.get(o2))!=0){
                    return Integer.compare(hashMap.get(o2), hashMap.get(o1));
                }
                if(o1.length()!=o2.length()){
                    return o2.length() - o1.length();
                }
                return o1.compareTo(o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str + "\n");
        }
        System.out.println(sb);
    }
}
