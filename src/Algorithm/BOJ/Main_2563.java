package Algorithm.BOJ;

import java.util.Scanner;

public class Main_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] arr = new int[100][100];
        int sum=count*100;
        int minus=0;
        for(int i =0; i<count;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            for (int q=x;q<x+10;q++){
                for (int w=y;w<y+10;w++){
                    if(arr[q][w]==1){
                        minus++;
                    }else{
                        arr[q][w]=1;
                    }
                }
            }
        }
        System.out.println(sum-minus);

    }
}
// 삽질의 기록^^
//            arr[q][0]=x;
//            arr[q][1]=y;
//            pureSum+=100;
//        }
//            //3 7 13 17
//            //5 2 15 12  -->(13-5) (12-7)
//            //15 7 25 17
//            //x축이 겹치는지 봐야 한다.
//            for(int i =0 ;i<count ;i++){//i번째 인덱스
//                //x축이 겹치나?
//                //겹친다면 빼주는 값을 감안해야.
//                for(int j =i+1;j<count;j++){//i+1번째 인덱스
//                    int lower_x=arr[i][0];
//                    int higer_x=lower_x+10;
//                    int tmp = arr[j][0];
//                    int higer_tmp=tmp+10;
//                    if(lower_x<=tmp&&tmp<higer_x){
//                        int get_x=higer_x-tmp;//x축은 가져왔다.
//                        int lower_y=arr[i][1];
//                        int higer_y=lower_y+10;
//                        int tmp_y = arr[j][1];
//                        int higer_tmp_y=tmp_y+10;
//                        int get_y=0;
//                        if(lower_y<=tmp_y&&tmp_y<higer_y){
//                            get_y=higer_y-tmp_y;
//                        }
//                        else if (lower_y<higer_tmp_y&&higer_tmp_y<=higer_y){
//                            get_y=higer_tmp_y-lower_y;
//                        }
//                        haveToMinus+=get_x*get_y;
//
//                        //y축 겹치는 정도를 알아봐야
//                    } else if (lower_x<higer_tmp&&higer_tmp<=higer_x) {
//                        int get_x=higer_tmp-lower_x;
//                        int lower_y=arr[i][1];
//                        int higer_y=lower_y+10;
//                        int tmp_y = arr[j][1];
//                        int higer_tmp_y=tmp_y+10;
//                        int get_y=0;
//                        if(lower_y<=tmp_y&&tmp_y<higer_y){
//                            get_y=higer_y-tmp_y;
//                        }
//                        else if (lower_y<higer_tmp_y&&higer_tmp_y<=higer_y){
//                            get_y=higer_tmp_y-lower_y;
//                        }
//                        haveToMinus+=get_x*get_y;
//                    }
//
//            }
//        }
