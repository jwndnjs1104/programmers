import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        while(true){
            int stop = 0;
            int num=2;
            
            while(true){
                if(n==num) {
                    if(!list.contains(num)) list.add(num);
                    stop = 1;
                    break;
                }
                if(n%num==0) {
                    if(!list.contains(num)) list.add(num);
                    n/=num;
                    break;
                }
                else num++;
            }
            
            if(stop==1) break;
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i< list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}