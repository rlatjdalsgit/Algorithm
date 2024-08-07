package Algorithm.BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Set<String> set = new HashSet<>();

        int N = Integer.parseInt(br.readLine());

        for (int i =0 ; i< N ;i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if(Objects.equals(b, "enter")){
                set.add(a);
            }else{
                set.remove(a);

            }
        }
        ArrayList<String> list = new ArrayList<String>(set);
        Collections.sort(list);

        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }


    }
}
