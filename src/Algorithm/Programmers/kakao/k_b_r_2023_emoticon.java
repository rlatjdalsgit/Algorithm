package Algorithm.Programmers.kakao;
import java.util.*;

public class k_b_r_2023_emoticon {
    int[][] users;
    int[] emoticons;
    int maxJoin = 0;
    int maxRevenue= 0;
    public int[] solution(int[][] users, int[] emoticons) {
        this.users = users;
        this.emoticons = emoticons;

        int[] discounts = {10,20,30,40};
        int[] selected = new int[emoticons.length];

        dfs(0,selected,discounts);

        return new int[]{maxJoin, maxRevenue};
    }

    private void dfs(int depth, int[] selected, int[] discounts){
        if(depth==emoticons.length){
            simulate(selected);
            return;
        }
        for(int discount : discounts){
            selected[depth]=discount;
            dfs(depth+1,selected, discounts);
        }
    }

    private void simulate(int[] discount){
        int joinCount =0;
        int revenue =0;

        for(int[] user : users){
            int userDiscountThreshold = user[0];
            int userPriceThreshold = user[1];
            int total =0;

            for(int i=0;i<emoticons.length;i++){
                if(discount[i]>=userDiscountThreshold){
                    int discountedPrice = emoticons[i]*(100-discount[i])/100;
                    total+=discountedPrice;
                }
            }
            if(total>=userPriceThreshold){
                joinCount++;
            }else{
                revenue += total;
            }
        }

        if(joinCount>maxJoin||(joinCount==maxJoin&&revenue>maxRevenue)){
            maxJoin = joinCount;
            maxRevenue = revenue;
        }
    }

}
