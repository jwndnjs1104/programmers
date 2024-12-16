import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int[] nums) {
        int num = nums.length/2; //가질수 있는 폰켓몬 수
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(!list.contains(i)) list.add(i);
        }
        int kinds = list.size();
        
        if(num>=kinds) return kinds;
        else return num;
    }
}