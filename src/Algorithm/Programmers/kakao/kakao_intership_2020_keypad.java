package Algorithm.Programmers.kakao;
import java.util.*;

public class kakao_intership_2020_keypad {
    public String solution(int[] numbers, String hand) {
        StringBuilder result = new StringBuilder();

        Map<Integer, int[]> keypad = new HashMap<>();

        int[][] positions = {
                {3,1},
                {0,0},{0,1},{0,2},
                {1,0},{1,1},{1,2},
                {2,0},{2,1},{2,2}
        };

        for(int i=0;i<=9;i++){
            keypad.put(i, positions[i]);
        }

        int[] left = {3,0};
        int[] right={3,2};

        for(int number  : numbers){
            int[] target = keypad.get(number);

            if(number ==1||number==4||number==7){
                result.append("L");
                left = target;
            }else if(number ==3||number==6||number==9){
                result.append("R");
                right = target;
            }else{
                int leftDist = getDistance(left, target);
                int rightDist = getDistance(right, target);

                if(leftDist<rightDist){
                    result.append("L");
                    left = target;
                }else if(leftDist>rightDist){
                    result.append("R");
                    right = target;
                }else{
                    if(hand.equals("right")){
                        result.append("R");
                        right = target;
                    }else{
                        result.append("L");
                        left = target;
                    }
                }
            }
        }
        return result.toString();

    }

    private int getDistance(int[] from, int[] to){
        return Math.abs(from[0] - to[0]) + Math.abs(from[1] - to[1]);

    }

}
