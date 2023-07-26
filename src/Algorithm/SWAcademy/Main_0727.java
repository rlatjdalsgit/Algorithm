package Algorithm.SWAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_0727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++){
            String[] len_wall = br.readLine().split(" ");
            int crush = Integer.parseInt(len_wall[1]);
            String arr = br.readLine();
            String[] myStrength = br.readLine().split(" ");
            String[] monster = br.readLine().split(" ");
            boolean WorD = fightChecker(monster, myStrength);
            boolean result = checker(arr, crush, WorD);
            System.out.println(result ? "YES" : "NO");

            if (i != count - 1) {
                br.readLine();
            }

        }

    }
    static int findIdx(String arr, char target){
        return arr.indexOf(target);
    }

    static int findIdx(String arr, int mylocation, char target){
        //5번째에 위치해있다면, 4번째 위치가 맞는것.
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ;i<arr.length();i++){
            if(arr.charAt(i)==target){
                stack.push(i);
            }
        }
        int closure =1000;
        int index = -1;
        while(!stack.isEmpty()){
            int standard = stack.pop();
            int  a= Math.abs((standard - mylocation));
            if(closure>a){
                closure =  a;
                index= standard;
            }
        }

        return index;
    }
    static boolean checker(String arr, int crush, boolean WorD){
        int myself = findIdx(arr, '@');
        int door = findIdx(arr, myself,'O');

        int start = Math.min(door, myself);
        int end = Math.max(door, myself);
        int count_wall=0;

        for (int i = start + 1; i < end; i++){
            if (arr.charAt(i) == '#') {
                count_wall++;
            } else if (arr.charAt(i) == '&') {
                 if (!WorD) {
                    return false;
                }
            }
        }
        if(count_wall>crush){
            return  false;
        }else return true;
    }

    static boolean fightChecker(String[] monster, String[] myStrength){
        int monsterAttack = Integer.parseInt(monster[0]);
        int monsterBlood = Integer.parseInt(monster[1]);
        int myAttack = Integer.parseInt(myStrength[0]);
        int myBlood = Integer.parseInt(myStrength[1]);
        while(true){
            monsterBlood-=myAttack;
            if(monsterBlood<=0){
                return true;
            }
            myBlood-=monsterAttack;
            if(myBlood<=0){
                return false;
            }
        }
    }
}
