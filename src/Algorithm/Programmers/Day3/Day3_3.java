package Algorithm.Programmers.Day3;

public class Day3_3 {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i=0;i<k;i++){
            answer+=my_string;
        }
        return answer;
    }
}
