class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int x:num_list){
            if(x%2==0) answer[0]+=1;
            else answer[1]+=1;
        }
        return answer;
    }
}