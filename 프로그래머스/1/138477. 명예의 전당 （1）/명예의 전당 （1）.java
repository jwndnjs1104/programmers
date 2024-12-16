import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            list.add(score[i]);
            //정렬하기
            list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            
            if(i<k-1) answer[i] = list.get(list.size()-1);
            else answer[i] = list.get(k-1);
        }
        return answer;
    }
}