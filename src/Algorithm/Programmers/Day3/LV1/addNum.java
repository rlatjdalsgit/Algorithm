package Algorithm.Programmers.Day3.LV1;

public class addNum {
    public int solution(int n) {
        String a = Integer.toString(n);
        int answer = 0;
        for(int i=0;i<a.length();i++){
            answer+=Integer.parseInt(String.valueOf(a.charAt(i)));
        }



        return answer;
    }

}
