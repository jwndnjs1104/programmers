import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        //문제 배열을 만들지 않고 패턴으로??
        //수포자1은 12345 패턴
        //수포자2는 21232425 패턴
        //수포자3은 3311224455 패턴
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int[] num = new int[3];
        
        for(int i=0; i<answers.length; i++){
            int i1 = i%5 ;
            int i2 = i%8 ;
            int i3 = i%10 ;
            if(answers[i] == p1[i1]) num[0]++;
            if(answers[i] == p2[i2]) num[1]++;
            if(answers[i] == p3[i3]) num[2]++;
        }
        
        List<Integer> list = new ArrayList<>();
        int max = num[0];
        list.add(1);
        
        for(int i=1; i<num.length; i++){
            if(max<num[i]) {
                list.set(0,i+1);
                max = num[i];
            }
            else if(max == num[i]) list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
        
        return answer;
    }
}