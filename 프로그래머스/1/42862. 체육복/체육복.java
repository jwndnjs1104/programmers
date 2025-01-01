import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        //리스트 만들어서 제거하면서 계산하면 되긴함.
        List<Integer> reserve_list = new ArrayList<>();
        List<Integer> lost_list = new ArrayList<>();
        for(int num:reserve) reserve_list.add(num);
        for(int num:lost) lost_list.add(num);
    
        for(int number:lost){
            //ConcurrentModificationException
            //현재 이터레이션 진행중에 같은 이터레이션을 변경하면 생기는 Exception
            //여벌 체육복 가져온 학생 중 도난당한 학생은 먼저 제거하기
            if(reserve_list.contains(number)) {
                int index = reserve_list.indexOf(number);
                reserve_list.remove(index);
                index = lost_list.indexOf(number);
                lost_list.remove(index);
            }
        }
        
        if(lost_list.isEmpty()) return n;
        int answer = n-lost_list.size(); //수업듣는 학생 수
        
        if(reserve_list.isEmpty()) return answer;
        lost_list = lost_list.stream().sorted().collect(Collectors.toList());
        
        for(int number:lost_list){
            //remove 메소드는 인덱스 번호가 매개변수겟지???
            //contains가 있는메소드인지??? 리스트 안에 요소가 잇는지 확인하는 메소드
            if(reserve_list.contains(number-1)){
                int index = reserve_list.indexOf(number-1);
                reserve_list.remove(index);
                answer++;
            }
            else if(reserve_list.contains(number+1)){
                int index = reserve_list.indexOf(number+1);
                reserve_list.remove(index);
                answer++;
            }
        }
        
        return answer;
    }
}