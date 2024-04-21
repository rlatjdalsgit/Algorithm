package Algorithm.SWAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_0728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++){
            String[] info = br.readLine().split(" ");
            //문자열 길이, 부실 능력, 몬스터 개수.
            int crushwall = Integer.parseInt(info[1]);
            Monster monsters[] = new Monster[Integer.parseInt(info[2])];
            String arr = br.readLine();//문자열
            Human human = new Human(br.readLine().split(" "), crushwall);
            for(int j=0;j<Integer.parseInt(info[2]);j++){
                String[] getMonster = br.readLine().split(" ");//괴물정보
                monsters[j]=new Monster(getMonster);
            }
            boolean result = YesOrNo(arr, human, monsters);
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

    static Human can_win(Monster monster, Human human){
        while(true){
            monster.HP-=human.ATK;
            if(monster.HP<=0){
                return human;
            }
            human.HP-= monster.ATK;
            if(human.HP<=0){
                return human;
            }
        }
    }
    static boolean YesOrNo(String arr, Human human, Monster[] monsters){
        int myself = findIdx(arr, '@');
        int door = findIdx(arr,myself,'O');

        int start = Math.min(door, myself);
        int end = Math.max(door, myself);
        int count_wall=0;
        for (int i = start + 1; i < end; i++){
            if (arr.charAt(i) == '#') {
                count_wall++;
            } else if (arr.charAt(i) == '&') {//괴물을 만났을 때.
                for(int z = 0;z<monsters.length;z++){
                    if(i==monsters[z].position){
                        human = can_win(monsters[z], human);
                        if(human.HP<=0){
                            return false;
                        }
                    }
                }
            }
        }
        if(count_wall>human.crush){
            return  false;
        }else return true;

    }
    static class Human{
        int ATK;
        int HP;
        int crush;
        public Human(String[] arr, int crush){
            this.ATK = Integer.parseInt(arr[0]);
            this.HP = Integer.parseInt(arr[1]);
            this.crush = crush;
        }
    }

    static class Monster{
        private int position;
        private int ATK;
        private int HP;
        public Monster(String[] arr){
            this.position= Integer.parseInt(arr[0])-1;
            this.ATK = Integer.parseInt(arr[1]);
            this.HP = Integer.parseInt(arr[2]);
        }
    }
}
