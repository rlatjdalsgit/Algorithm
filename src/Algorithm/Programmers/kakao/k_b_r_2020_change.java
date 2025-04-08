package Algorithm.Programmers.kakao;

public class k_b_r_2020_change {

    public String solution(String p) {
        //1
        if(p.isEmpty()) return "";

        //2
        int index = getBalancedIndex(p);
        String u= p.substring(0, index+1);
        String v = p.substring(index+1);

        //3
        if(isCorrect(u)){
            return u+solution(v);
        }else{
            //4
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(solution(v));
            sb.append(')');

            String reversed = reverse(u.substring(1, u.length() - 1));
            sb.append(reversed);

            return sb.toString();
        }
    }
    private int getBalancedIndex(String s){
        int left=0, right=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') left++;
            else right ++;

            if(left ==right) return i;
        }
        return -1;
    }
    private boolean isCorrect(String s){
        int count =0;

        for(char ch : s.toCharArray()){
            if(ch=='(') count++;
            else{
                count--;
                if(count<0) return false;
            }
        }
        return count==0;
    }

    private String reverse(String s){
        StringBuilder sb = new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch=='(') sb.append(')');
            else sb.append('(');
        }

        return sb.toString();
    }

}
