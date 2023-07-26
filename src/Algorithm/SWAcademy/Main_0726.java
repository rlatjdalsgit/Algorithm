package Algorithm.SWAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++){
            String[] len_wall = br.readLine().split(" ");
            int crush = Integer.parseInt(len_wall[1]);
            String arr = br.readLine();
            if (i != count - 1) {
                br.readLine();
            }
            boolean TF = checker(arr, crush);
            if(TF){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    static int findIdx(String arr, char target){
        return arr.indexOf(target);
    }
    static boolean checker(String arr, int crush){
        int door = findIdx(arr, 'O');
        int tanos = findIdx(arr, 'G');
        int myself = findIdx(arr, '@');
        int count_door=0;
        int count_tanos=0;
        //나랑 건틀렛, 나랑 문 사이에 벽이 몇개인지 확인. 둘중 하나라도 crush보다 작거나 같게
        //사용해서 도달하면 true 안되면 false
        int start = Math.min(door, myself);
        int end = Math.max(door, myself);
        for (int i = start + 1; i < end; i++) {
            if (arr.charAt(i) == '#') {
                count_door++;
            }
        }
        int start_t = Math.min(tanos, myself);
        int end_t = Math.max(tanos, myself);
        for (int i = start_t + 1; i < end_t; i++) {
            if (arr.charAt(i) == '#') {
                count_tanos++;
            }
        }
        if(count_tanos<=crush||count_door<=crush){
            return true;
        }else{
            return false;

        }
    }
}
