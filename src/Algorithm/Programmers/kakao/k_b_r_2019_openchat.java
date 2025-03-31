package Algorithm.Programmers.kakao;
import java.util.*;

public class k_b_r_2019_openchat {
    public String[] solution(String[] record) {
        Map<String, String> nicknameMap = new HashMap<>();//uid->nick
        List<String[]> logs = new ArrayList<>();

        for(String line:record){
            String[] parts = line.split(" ");
            String action = parts[0];
            String uid = parts[1];

            if(action.equals("Enter")||action.equals("Change")){
                String nickname = parts[2];
                nicknameMap.put(uid,nickname);
            }

            if(!action.equals("Change")){
                logs.add(new String[]{action, uid});
            }
        }

        String[] answer = new String[logs.size()];

        int idx =0;

        for(String[] log:logs){
            String action = log[0];
            String uid = log[1];

            String nickname = nicknameMap.get(uid);

            if(action.equals("Enter")){
                answer[idx++]=nickname+"님이 들어왔습니다.";
            }else if(action.equals("Leave")){
                answer[idx++]=nickname+"님이 나갔습니다.";

            }
        }

        return answer;
    }

}
