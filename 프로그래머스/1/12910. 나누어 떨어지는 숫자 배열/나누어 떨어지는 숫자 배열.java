import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor ==0 ) list.add(arr[i]);
        }
        int[] answer = {-1};
        if(list.isEmpty()) return answer;
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        
        
        
        for(int i=0; i<answer.length-1; i++){
            for(int j=i+1; j<answer.length; j++){
                if(answer[i]>answer[j]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }   
        }
            
        return answer;
    }
}