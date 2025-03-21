package Algorithm.Programmers.kakao;

public class BLIND_RECRUITMENT_2021_lv1 {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();

        new_id = new_id.replaceAll("[^0-9a-z-._]","");

        new_id = new_id.replaceAll("\\.{2,}",".");

        new_id = new_id.replaceAll("^\\.|\\.$","");

        if(new_id.isEmpty()){
            new_id = "a";
        }

        if(new_id.length()>=16){
            new_id = new_id.substring(0,15);
            new_id = new_id.replaceAll("\\.$","");
        }
        if(new_id.length()<=2){
            while(new_id.length()<3){
                new_id+=new_id.charAt(new_id.length()-1);
            }
        }

        return new_id;
    }

}
