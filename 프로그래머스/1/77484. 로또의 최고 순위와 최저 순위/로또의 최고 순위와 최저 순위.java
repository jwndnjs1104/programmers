class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win = 0;
        int zero = 0;
        for(int num:lottos){
            if(num == 0){
                zero++;
                continue;
            }
            for(int win_num:win_nums){
                if(num==win_num){
                    win++;
                    break;
                }
            }
        }
        int min_num = win;
        int max_num = zero+win;
        if(7-max_num == 7) answer[0] = 6;
        else answer[0] = 7-max_num;
        
        if(7-min_num == 7) answer[1] = 6;
        else answer[1] = 7-min_num;
        
        return answer;
    }
}