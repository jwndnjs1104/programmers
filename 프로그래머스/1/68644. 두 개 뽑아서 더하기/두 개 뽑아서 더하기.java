import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(!list.contains(numbers[i]+numbers[j])) list.add(numbers[i]+numbers[j]);
            }
        }
        
        //리스트를 배열로 변환해서 정렬해도 되고
        //int[] answer = list.toArray(new int[list.size()]);
        
        //Stream 이용하여 정렬하고 배열로 변환해도 되고
        list = list.stream().sorted().collect(Collectors.toList());
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        
        //for문으로 배열 정렬하기
        return answer;
    }
}