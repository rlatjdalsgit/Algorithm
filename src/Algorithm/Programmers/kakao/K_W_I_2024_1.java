package Algorithm.Programmers.kakao;

import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {

        int n = friends.length;

        Map<String, Integer> friendIndex = new HashMap<>();

        for(int i =0;i<n;i++){
            friendIndex.put(friends[i],i);
        }

        int[][] giftHistory = new int[n][n];
        Map<String, Integer> giftSent = new HashMap<>();
        Map<String, Integer> giftReceived = new HashMap<>();

        for (String friend : friends){
            giftSent.put(friend,0);
            giftReceived.put(friend,0);
        }

        for(String gift : gifts){
            String[] split = gift.split(" ");
            String giver = split[0];
            String receiver = split[1];

            int giverIdx = friendIndex.get(giver);
            int receiverIdx = friendIndex.get(receiver);

            giftHistory[giverIdx][receiverIdx] ++;

            giftSent.put(giver, giftSent.get(giver) + 1);
            giftReceived.put(receiver, giftReceived.get(receiver) + 1);

        }

        Map<String, Integer> giftScore = new HashMap<>();
        for (String friend : friends) {
            giftScore.put(friend, giftSent.get(friend) - giftReceived.get(friend));
        }


        int[] nextMonthGifts = new int[n];

        for(int i=0;i<n;i++){
            String personA = friends[i];

            for(int j= 0; j<n;j++){
                if(i==j) continue;

                String personB = friends[j];

                int sendAB = giftHistory[i][j];
                int sendBA = giftHistory[j][i];

                if(sendAB>sendBA){
                    nextMonthGifts[i]++;
                }else if ( sendAB == sendBA){
                    int scoreA = giftScore.get(personA);
                    int scoreB = giftScore.get(personB);
                    if (scoreA > scoreB) {
                        nextMonthGifts[i]++;
                    }

                }
            }
        }


        return Arrays.stream(nextMonthGifts).max().orElse(0);
    }
}