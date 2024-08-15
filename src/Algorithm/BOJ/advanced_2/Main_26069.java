package Algorithm.BOJ.advanced_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int N = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ChongChong");

        for (int i = 0; i < N; i++) {
            st= new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            if(hashSet.contains(str1)){
                hashSet.add(str2);
            } else if (hashSet.contains(str2)) {
                hashSet.add(str1);
            }
        }

        System.out.println(hashSet.size());

    }
}
