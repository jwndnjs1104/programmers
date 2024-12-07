import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        //길이 1이면 -1인 배열 반환
        if(arr.length==1) {
            answer = new int[1];
            answer[0]=-1;
            return answer;
        }
        else answer = new int[arr.length-1];
        
        
        //최소값 구하고 리스트에서 제거하기
        int min = arr[0];
        for(int num:arr){
            list.add(num);
            if(min>num) min=num;
        }
        
        list.remove(list.indexOf(min));
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}