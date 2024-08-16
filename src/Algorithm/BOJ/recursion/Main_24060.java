package Algorithm.BOJ.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_24060 {
    static int[] arr;
    static int[] tmp; //정렬 후 저장하는 배열
    static int cnt = 0; //저장 횟수 누적 저장
    static int K; // 저장 횟수
    static int result = -1; //결과 저장 (실패시 -1)


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        tmp = new int[N]; //오름차순 정렬해서 저장할 배열 초기화

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(arr,0,N-1);
        System.out.println(result);

    }

    static void merge_sort(int[] arr, int start, int end) {
        int q;

        if(cnt > K) return; //저장 횟수가 진행 횟수보다 넘어가게 되면 더이상 분해 or 병합 진행X

        if (start < end) {
            q=(start+end)/2;
            merge_sort(arr, start, q);
            merge_sort(arr, q+1, end);
            merge(arr,start, q, end);
        }
    }
    static void merge(int[] arr, int p, int q, int r){
        int i=p;
        int j =q+1;
        int t =0;
        while (i<=q && j<=r){
            if(arr[i]<=arr[j]){
                tmp[t++]=arr[i++];
            }else{
                tmp[t++]=arr[j++];

            }
        }
        while(i<=q){
            tmp[t++]=arr[i++];
        }
        while (j <= r) {
            tmp[t++] = arr[j++];
        }
        i= p;
        t=0;

        while(i<=r){
            cnt++;
            if(cnt == K){ //저장횟수가 같다면
                result = tmp[t]; //해당 증가한 만큼의 t인덱스의 값을 result변수에 담고
                break;
            }

            arr[i++]=tmp[t++];
        }


    }


}
