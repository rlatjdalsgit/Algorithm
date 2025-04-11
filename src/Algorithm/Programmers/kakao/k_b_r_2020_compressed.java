package Algorithm.Programmers.kakao;

public class k_b_r_2020_compressed {
    public int solution(String s) {
        int minLength = s.length();

        for(int unit =1;unit<=s.length()/2;unit++){
            StringBuilder compressed = new StringBuilder();//압축 결과 저장
            String prev = s.substring(0,unit);//first block
            int count =1;

            for(int i=unit;i<=s.length();i+=unit){
                String current = s.substring(i,Math.min(i+unit,s.length()));

                if(prev.equals(current)){
                    count++;
                }else{
                    if(count>1){
                        compressed.append(count);
                    }
                    compressed.append(prev);
                    prev = current;
                    count =1;

                }
            }

            if(count>1){
                compressed.append(count);
            }
            compressed.append(prev);
            minLength = Math.min(minLength, compressed.length());
        }

        return minLength;
    }
}
