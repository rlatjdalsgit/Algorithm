package Algorithm.Programmers.kakao;
import java.util.*;

public class k_i_2020_max {
    public long solution(String expression) {

        List<String> ops = Arrays.asList("+","*","-");
        List<String> usedOps = new ArrayList<>();

        for (String op : ops){
            if(expression.contains(op)){
                usedOps.add(op);
            }
        }

        List<List<String>> permutations = new ArrayList<>();
        boolean[] visited = new boolean[usedOps.size()];
        generatePermutations(usedOps, new ArrayList<>(), visited, permutations);

        long max = 0;
        for(List<String> order : permutations){
            long result = Math.abs(evaluate(expression, order));
            max = Math.max(result, max);
        }
        return max;
    }

    private void generatePermutations(List<String> ops, List<String> path, boolean[] visited, List<List<String>> result){
        if(path.size()==ops.size()){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<ops.size();i++){
            if(!visited[i]){
                visited[i]=true;
                path.add(ops.get(i));
                generatePermutations(ops, path, visited, result);
                path.remove(path.size()-1);
                visited[i]=false;
            }
        }
    }

    private long evaluate(String expression, List<String> order){
        List<String> tokens = new ArrayList<>();
        int idx =0;
        StringBuilder num = new StringBuilder();
        while(idx<expression.length()){
            char ch = expression.charAt(idx);
            if(ch=='+'||ch=='*'||ch=='-'){
                tokens.add(num.toString());
                num.setLength(0);
                tokens.add(String.valueOf(ch));
            }else{
                num.append(ch);
            }
            idx++;
        }
        tokens.add(num.toString());

        for(String op : order){
            List<String> newTokens = new ArrayList<>();
            int i=0;
            while(i<tokens.size()){
                String token =tokens.get(i);
                if(token.equals(op)){
                    long left  = Long.parseLong(newTokens.remove(newTokens.size()-1));
                    long right = Long.parseLong(tokens.get(++i));
                    long calc = calculate(left, right, op);
                    newTokens.add(String.valueOf(calc));
                }else{
                    newTokens.add(token);
                }
                i++;
            }
            tokens = newTokens;
        }

        return Long.parseLong(tokens.get(0));
    }
    private long calculate(long a, long b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
        }
        return 0;
    }

}
