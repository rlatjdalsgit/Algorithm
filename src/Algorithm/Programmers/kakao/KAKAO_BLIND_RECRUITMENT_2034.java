package Algorithm.Programmers.kakao;
import java.util.*;

public class KAKAO_BLIND_RECRUITMENT_2034 {

        public int[] solution(String today, String[] terms, String[] privacies) {
            Map<String, Integer> termsMap = new HashMap<>();
            List<Integer> toDelete = new ArrayList<>();

            for(String term : terms){
                String[] split = term.split(" ");
                termsMap.put(split[0], Integer.parseInt(split[1]));
            }

            int todayDays = convertDateToDays(today);

            for(int i=0;i<privacies.length;i++){
                String[] split = privacies[i].split(" ");

                int collectedDate = convertDateToDays(split[0]);
                int termsMonths = termsMap.get(split[1]);

                int expiryDate = collectedDate+(termsMonths*28);

                if(expiryDate<=todayDays){
                    toDelete.add(i + 1);

                }

            }
            return toDelete.stream().mapToInt(i -> i).toArray();

        }

        private int convertDateToDays(String date){
            String[] split = date.split("\\.");
            int year = Integer.parseInt(split[0]);
            int month = Integer.parseInt(split[1]);
            int day = Integer.parseInt(split[2]);

            return (year*12*28)+(month*28)+day;

        }
}
