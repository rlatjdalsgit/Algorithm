package Algorithm.Programmers.Day3.LV1;

public class p_y_counter {
    boolean solution(String s) {
        boolean answer = true;
        int p_counter = 0;
        int y_counter = 0;
        for(int i = 0;i<s.length();i++){
            char compare = s.charAt(i);
            compare=Character.toLowerCase(compare);
            if(compare=='p'){
                p_counter++;
            }else if(compare=='y'){
                y_counter++;
            }
        }
        if(p_counter!=y_counter){
            answer=false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }

}
