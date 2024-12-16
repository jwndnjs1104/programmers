import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int n=0; n<commands.length; n++){
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            
            //배열 자르기
            List<Integer> list = new ArrayList<>();
            for(int m=i-1; m<=j-1; m++){
                list.add(array[m]);
            }
            
            //자른 배열 정렬하기
            list = list.stream().sorted().collect(Collectors.toList());
            
            //k번째 수 넣기
            answer[n] = list.get(k-1);
        }
        return answer;
    }
}