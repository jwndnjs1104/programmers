import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        //bandage -> [시전시간, 초당 회복량, 추가 회복량]
        //attack -> [공격시간, 피해량]
        
        int answer = health; //체력
        int bt = 0; //bandage time, 시전시간
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<attacks.length; i++){
            for(int info:attacks[i]){
                list.add(new ArrayList<>());
                list.get(i).add(info);
            }
        }
        
        for(int i=1; i<=attacks[attacks.length-1][0]; i++){ //마지막 공격 시간까지
            if(list.size()!=0 && i==list.get(0).get(0)) { //공격이 있으면
                bt = 0;
                answer -= list.get(0).get(1);
                list.remove(0);
                if(answer<=0) return -1;
            }
            else{ //공격이 없으면
                bt++;
                answer+=bandage[1];
                if(bt==bandage[0]) {
                    answer+=bandage[2];
                    bt=0;
                }
                
                if(answer>health) answer=health;
            }
            
        }
        
        return answer;
    }
}