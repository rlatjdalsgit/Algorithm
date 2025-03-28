package Algorithm.Programmers.kakao;
import java.util.*;

public class k_b_r_2022_parkingFee {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inTimeMap = new HashMap<>(); // 차량 번호 → 마지막 입차 시각
        Map<String, Integer> totalTimeMap = new HashMap<>(); // 차량 번호 → 총 주차 시간

        for (String record : records) {
            String[] parts = record.split(" ");
            String[] time = parts[0].split(":");

            int minutes = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]); // 시:분 → 분
            String carNumber = parts[1];
            String action = parts[2];

            if (action.equals("IN")) {
                inTimeMap.put(carNumber, minutes);
            } else { // OUT
                int inTime = inTimeMap.remove(carNumber);
                int duration = minutes - inTime;
                totalTimeMap.put(carNumber, totalTimeMap.getOrDefault(carNumber, 0) + duration);
            }
        }
        for(String carNumber:inTimeMap.keySet()){
            int inTime = inTimeMap.get(carNumber);
            int duration = (23*60+59)-inTime;

            totalTimeMap.put(carNumber, totalTimeMap.getOrDefault(carNumber,0)+duration);

        }

        List<String> carNumbers = new ArrayList<>(totalTimeMap.keySet());
        Collections.sort(carNumbers);
        int[] answers = new int[carNumbers.size()];

        for(int i=0; i<carNumbers.size();i++){
            String car = carNumbers.get(i);
            int time = totalTimeMap.get(car);
            answers[i]= calculateFee(time,fees);
        }
        return answers;
    }

    private int calculateFee(int time, int[] fees){
        int baseTime = fees[0], baseFee = fees[1];
        int unitTime = fees[2], unitFee = fees[3];
        if(time<=baseTime){
            return baseFee;
        }
        int extraTime = time - baseTime;
        int units = (int) Math.ceil((double) extraTime / unitTime);
        return baseFee + units * unitFee;

    }

}
