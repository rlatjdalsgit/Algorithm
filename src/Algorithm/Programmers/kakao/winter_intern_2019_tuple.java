package Algorithm.Programmers.kakao;

import java.util.*;
public class winter_intern_2019_tuple {
    public int[] solution(String s) {
        s = s.substring(2,s.length()-2);
        String[] sets = s.split("},\\{");

        List<List<Integer>> tupleList = new ArrayList<>();
        for(String set : sets){
            List<Integer> innerList = new ArrayList<>();
            for(String num:set.split(",")){
                innerList.add(Integer.parseInt(num));
            }
            tupleList.add(innerList);
        }

        tupleList.sort(Comparator.comparingInt(List::size));

        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(List<Integer> list: tupleList){
            for(int num:list){
                if(!seen.contains(num)){
                    seen.add(num);
                    result.add(num);
                }
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}
