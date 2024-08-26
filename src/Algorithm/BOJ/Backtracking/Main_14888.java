package Algorithm.BOJ.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14888 {
    static int minValue = Integer.MAX_VALUE;
    static int maxValue = Integer.MIN_VALUE;
    static int[] operator = new int[4];
    static int[] number;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        number=new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            number[i]=Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            operator[i]=Integer.parseInt(st.nextToken());
        }

        solution(number[0], 1);

        System.out.println(maxValue);
        System.out.println(minValue);
    }
    static void solution(int num, int index){//num==연산 합계, index = 연산횟수(==n >> 연산자 다 사용했다는 뜻)
        if(index==n){
            maxValue=Math.max(maxValue, num);
            minValue=Math.min(minValue, num);
        }

        for(int i=0;i<4;i++){//왜 4일까? 연산자는 4개니깐. +-*/ 순으로 하나씩 조져보자.
            if(operator[i]>0){//사용해야할 친구가 있다면,
                operator[i]--;//연산자 소모

                switch (i){
                    case 0://덧셈
                        solution(num+number[index], index+1);
                        break;
                    case 1://뺄셈
                        solution(num-number[index], index+1);
                        break;
                    case 2://곱
                        solution(num*number[index], index+1);
                        break;
                    case 3://나눔
                        solution(num/number[index], index+1);
                        break;
                }
                operator[i]++;//연산자 복구(다음에도 해야하니깐)

            }
        }
    }
}
