package Algorithm.Programmers.kakao;

import java.util.*;
public class KAKAO_BLIND_RECRUITMENT_2022 {
    public int[] solution(String[] id_list, String[] report, int k) {
        //신고당한 횟수
        Map<String, Integer> count = new HashMap<>();
        //내가 신고한 리스트
        Map<String, Set<String>> map = new HashMap<>();

        for (String str : id_list){
            count.put(str, 0);
            map.put(str, new HashSet<>());
        }

        for(String r : report){
            String[] split = r.split(" ");
            String reporter = split[0];
            String reported = split[1];

            if(!map.get(reporter).contains(reported)){
                map.get(reporter).add(reported);
                count.put(reported,(count.get(reported)+1));
            }
        }

        Set<String> banned = new HashSet<>();

        for(String user : id_list){
            if(count.get(user)>=k){
                banned.add(user);
            }
        }
        int[] result = new int[id_list.length];

        for(int i=0;i<id_list.length;i++){
            String user = id_list[i];
            int reportingCount = 0;
            for(String reported : map.get(user)){
                if(banned.contains(reported)){
                    reportingCount++;
                }
            }
            result[i]=reportingCount;
        }
        return result;
    }

}
