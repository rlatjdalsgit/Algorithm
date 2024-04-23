package Algorithm.Programmers.Day3.LV1;

public class sumA2B {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b){
            return a;
        }else{
            answer+=a+b;
            if(a>b){
                while(a>b){
                    answer+=b+1;
                    b++;
                }
            }else{
                while(a<b){
                    answer+=a+1;
                    a++;
                }

            }
        }
        return answer;
    }

    public long solution2(int a, int b) {
        long answer = 0;
        if (a == b) {
            return a;
        }
        // a와 b 사이의 모든 정수를 더하는 등차수열의 합 공식 사용
        // 두 수의 합 * (두 수 사이의 정수 개수 + 1) / 2
        answer = (long)(a + b) * (Math.abs((long)a - b) + 1) / 2;

        return answer;
    }

}
